package variaveis;

public class Matematica {
    public static void main(String[] args) {
        //Potencia
        int base = 2;
        int expoente = 3;
        double potencia = Math.pow(base, expoente);

        //Raiz Quadrada
        double numero = 16;
        double raizQuadrada = Math.sqrt(numero);

        //Randow - Gerar valores aleatórios
        int aleatorio = (int) (Math.random() *10);
        System.out.println(aleatorio);

        // Valor de pi
        double pi = Math.PI;
        System.out.println( pi);



    }
}

