package exercicioPOO;

public class AlunoPoo {
    String nome;
    Double nota1;
    Double nota2;

    //Metodo:
    //Com retorno: for - array.size.
    public Double calculoMedia() {
        Double media = (nota1 + nota2) / 2;
        return media;
    }
    //Sem retorno: apenas executa o bloco de código.
}
