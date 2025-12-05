package desafio;

public class Produto {
    String nome;
    Double valor;
    Double quantidade;

    //Metodo
    public Double calcularTotal() {
        Double total = valor * quantidade;
        return total;
    }
}
