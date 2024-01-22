/**
 * 4 notas dividir por 4
 * maior igual a 7 = aprovado
 * menor que 7 maior menor 5 = recuperação
 * menor que 5 = reprovado
 */

 import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = s.nextLine();

        System.out.println("Digite a primeira nota de " + nome);
        double nota1 = s.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = s.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = s.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double nota4 = s.nextDouble();

        double media = calcularMedia(nota1, nota2, nota3, nota4);

        if (media >= 7) {
            System.out.println("Aluno aprovado");
        } else if (media >= 5) {
            System.out.println("Aluno em recuperação");
        } else {
            System.out.println("Aluno reprovado");
        }

        s.close();
    }

    public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }
}