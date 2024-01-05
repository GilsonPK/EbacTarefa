public class Casting {
  
    /**
     * Casting é um recurso, que possibilita mudar um valor de um tipo para o outro
     * boolean - Não pode ser moldado para nenhum outro tipo, tanto implicitamente quanto explicitamente.
     * char - Nenhum outro tipo pode ser moldado para char.
     * long é semelhante a um inteiro, mas com uma possibilidade maior de números.
     */ 

     //casting explicito
    public static void main(String[] args) {
        int num1 = 10;
        short num2 = (short) num1;

        long numL = 1111111111111111111l;
        System.out.println(numL);
        int numI = (int) numL; //Ao utilizar dessa maneira os dados são perdidos pois está colocando 64bits em uma variável de 16
        System.out.println(numI);

    //casting implicito
        int idade = 10;
        long idadeL = idade; //não precisa declarar o casting pois está jogando 16bits em uma variável de 64

        System.out.println("Teste: " + idadeL);
    }
}
