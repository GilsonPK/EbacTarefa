
public class tarefaCalculoMedia {
    public static void main(String[] args) {
     
        double nota1 = 6.7;
        double nota2 = 5.8;
        double nota3 = 8.0;
        double nota4 = 7.2;
        double media = calcularMedia(nota1, nota2, nota3, nota4);

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota 4: " + nota4);
        System.out.println("A média é: " + media);

        if (media >= 6) {
            System.out.println("Aluno aprovado.");
        }
        else { 
            System.out.println("Aluno reprovado.");
        }

    }

    public static double calcularMedia(double nota1, double nota2, double nota3, double nota4){
        return (nota1 + nota2 + nota4 + nota4) / 4.0;

    }
    
}
