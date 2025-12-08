package Desafio;

public class Roupa {
    String marca;
    String tipo;
    String tamanho;
    int quantidade;
    double valor;

    public Roupa(String marca, String tipo, String tamanho, String s, int quantidade, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public void venda(int quantidade){
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
            System.out.println("Peça comprada com sucesso!");

        } else {
            System.out.println("Valor inválido");
        }
    }

    public void abastecer (int quantidade) {
        if (quantidade > 0 ) {
            this.quantidade += quantidade;
            System.out.println("Estoque com sucesso!");
        }else{
            System.out.println("Valor inválido");
        }

    }
    public double valorTotal() {
        return this.quantidade * this.valor;

    }

    public String toString() {
        return
                "\n Marca: " + marca +
                "\n Tipo: " + tipo +
                "\n Tamanho: " + tamanho +
                "\n Quantidade: " + quantidade +
                "\n Valor unitário: " + valor +
                "\n Valor total: " + valorTotal();
    }
}
