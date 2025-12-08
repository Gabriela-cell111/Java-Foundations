package exercicio;

public class Livro {
    String titulo;
    String autor;
    String editora;

    double precoUnitario;
    int quantidade;

    public Livro(String titulo, String autor, String editora, int quantidade, double precoUnitario) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;

    }

    public void alugaLivro(int quantidade) {
        if (quantidade < 0 || quantidade > this.quantidade) {
            System.out.println("Valor inválido");
        } else {
            this.quantidade -= quantidade;
            System.out.println("Livro alugado com sucesso!");
        }

    }

    public void devolveLivro(int quantidade) {
    if (quantidade > 0 ) {
        this.quantidade += quantidade;
    }else{
        System.out.println("Valor inválido");
        }

    }

    public double valorTotal() {
        return this.precoUnitario * this.quantidade;
    }

    public String toString () {
            return "Livro: " + this.titulo +
                    "\nAutor: " + this.autor +
                    "\nEditora: " + this.editora +
                    "\nQuantidade: " + this.quantidade +
                    "\nValor do livro: " + this.precoUnitario +
                    "\nValor total: " + this.valorTotal();
        }


    }