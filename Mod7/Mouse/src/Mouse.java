public class Mouse  {
    
    //propriedades
    private String marca;
    private String modelo;
    private int numeroBotoes;
    private boolean ligado;

    //construtor
    public Mouse(String modelo, int numeroBotoes) {
        this.marca = marca; 
        this.modelo = modelo;
        this.numeroBotoes = numeroBotoes;
        this.ligado = false; //mouse inicia desligado por padrão
    }

    //métodos
    public void ligar() {
        ligado = true;
        System.out.println("Mouse ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Mouse desligado.");
    }
    
    public void clique() {
        if (ligado) {
            System.out.println("Clicou!");
        }
        else {
            System.out.println("O mouse está desligado. Não foi possível detectar o clique");
        }
    }

    public void movimentar(int deltaX, int DeltaY) {
        if (ligado) {
            System.out.println("Mouse movimentado. Delta X: " + deltaX + ", Delta Y: " + DeltaY);
        }

        else {
            System.out.println("Mouse está desligado. Não foi possível detectar o movimento.");
        }
    }
}
