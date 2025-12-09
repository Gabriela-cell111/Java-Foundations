package exercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrizBidimensional {
    static void main(String[] args) {
        ArrayList<String> menuLanches = new ArrayList<>(Arrays.asList(
                " X-SALADA ", //alt + enter = importar.
                " X-BURGUER ",
                " X-BACON "
        ));

        ArrayList<Double> menuPrecos = new ArrayList<>(Arrays.asList(
                20.90,
                22.90,
                23.90

        ));

        System.out.println("----CARDÁPIO----");
        for(int i = 0; i < menuLanches.size(); i++) {
            System.out.println(menuLanches.get(i) + " - " + menuPrecos.get(i));
        }







    }
}
