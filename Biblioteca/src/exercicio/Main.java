package exercicio;

public class Main {
    public static void main(String[] args) {

        Livro biblioteca = new Livro(
                "A droga da obediência" ,
                "Pedro Bandeira" ,
                "Editora Moderna" ,
                5 ,
                20.99);

        System.out.println(biblioteca.toString());

        biblioteca.alugaLivro(4);

        biblioteca.devolveLivro(5);

        System.out.println(biblioteca.toString());


    }

}
