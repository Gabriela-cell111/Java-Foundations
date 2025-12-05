package Desafio;

public class Roupa {
    String marca;
    String tipo;
    String tamanho;
    double quantidade;
    double valor;

    public Roupa(String marca, String tipo, String tamanho, String s, int quantidade, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valor = valor;

    }

    public void retira(int quantidade){
        if (quantidade < 0 || quantidade > this.quantidade) {
            System.out.println("Valor inválido");
        } else {
            this.quantidade -= quantidade;
            System.out.println("Livro alugado com sucesso!");
        }
    }

    public void retorno (int quantidade) {
        if (quantidade > 0 ) {
            this.quantidade += quantidade;
        }else{
            System.out.println("Valor inválido");
        }

    }

    public double valorTotal() {
        double valorTotal = quantidade * valor;
        return valorTotal;

    }
    public String toString() {
        return "Marca: " + this.marca +
                "\nPeça: " + this.tipo +
                "\nTamanho: " + this.tamanho +
                "\nQuantidade: " + this.quantidade +
                "\nValor: " + this.valor +
                "\nValor Total: " + this.valorTotal();

    }
}


