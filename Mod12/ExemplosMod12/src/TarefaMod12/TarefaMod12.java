import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TarefaMod12 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite nomes e sexos separados por vírgula (Ex: João-M, Maria-F):");
        String entrada = scanner.nextLine();

        String[] entradas = entrada.split(",\\s*");

        List<String> nomesSexos = new ArrayList<>();

        java.util.Map<String, List<String>> generos = new java.util.HashMap<>();

        Collections.addAll(nomesSexos, entradas);

        for (String nomeSexo : nomesSexos) {
            String[] partes = nomeSexo.split("-");
            String nome = partes[0];
            String sexo = partes[1];

            generos.computeIfAbsent(sexo, ignoredKey -> new ArrayList<>()).add(nome + "-" + sexo);
        }

        System.out.println("Nomes agrupados por gênero:");
        for (java.util.Map.Entry<String, List<String>> entry : generos.entrySet()) {
            String genero = entry.getKey();
            List<String> nomesDoGenero = entry.getValue();

            System.out.println("Gênero: " + genero);
            for (String nome : nomesDoGenero) {
                System.out.println(nome);
            }
        }

        scanner.close();
    }
}
