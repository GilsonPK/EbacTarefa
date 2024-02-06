package list;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ExemploArrayList {

    public static void main(String[] args) {
       // exemploListaSimples();
        //exemploListaSimplesOrdemAscendente();
        exemploNumeros(); 
    }
    

private static void exemploNumeros(){
    System.out.println("******** exemplo numeros ********");
    List<Integer> numeros = new ArrayList<>();
    numeros.add(1);
    numeros.add(3);
    System.out.println(numeros);
}

}
