import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TarefaMod11Nomes {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite nomes separados por vírgula: ");
        String entrada = scanner.nextLine();

        String[] nomesArray = entrada.split(",\\s*");
        
        List<String> nomes = new ArrayList<>();

        Collections.addAll(nomes, nomesArray);

        Collections.sort(nomes);

        System.out.println("Nomes ordenados por ordem alfabética:");
        for (String nome : nomes){
            System.out.println(nome);
        }

        scanner.close();
    }
}
