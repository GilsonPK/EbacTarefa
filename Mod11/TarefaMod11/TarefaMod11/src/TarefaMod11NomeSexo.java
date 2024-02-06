import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TarefaMod11NomeSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite nomes e sexos separados por vírgula (Ex: João-Masculino, Maria-Feminino):");
        String entrada = scanner.nextLine();

        // Dividir as entradas usando a vírgula como delimitador e remover espaços extras
        String[] entradas = entrada.split(",\\s*");

        // Criar uma lista para armazenar os nomes e sexos
        List<String> nomesSexos = new ArrayList<>();

        // Mapa para agrupar por gênero
        java.util.Map<String, List<String>> generos = new java.util.HashMap<>();

        // Adicionar as entradas à lista de nomes e sexos
        Collections.addAll(nomesSexos, entradas);

        // Separar e imprimir por gênero
        for (String nomeSexo : nomesSexos) {
            String[] partes = nomeSexo.split("-");
            String nome = partes[0];
            String sexo = partes[1];

            // Adicionar ao grupo correspondente no mapa
            generos.computeIfAbsent(sexo, ignoredKey -> new ArrayList<>()).add(nome + "-" + sexo);
        }

        // Exibir os nomes agrupados por gênero
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
