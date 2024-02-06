package list;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ExemploArrayListAluno {
    
    public static void main(String[] args) {
        exemploListaSimplesOrdenadaComparatorAluno();
        exemploListaSimplesOrdenadaClasseExterna();
    }

    private static void exemploListaSimplesOrdenadaClasseExterna(){
        System.out.println("****** exemploListaSimplesOrdenadaClasseExterna ******");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno(nome: "João da Silva", curso: "Linux básico", nota: 0);
        Aluno b = new Aluno(nome: "Antonio Sousa", curso: "OppenOffice", nota: 0);
        Aluno c = new Aluno(nome: "Lucia Ferreira", curso: "Internet", nota: 0);

        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println(lista);
        //Collections.sort(lista);
        System.out.println(lista);
        System.out.println("null");
        
    }
}
