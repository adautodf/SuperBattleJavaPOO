import java.util.Random;

public class Game {
    static int dadoGerado;
    public static void rolaDado(){
        Random gerador = new Random();
        dadoGerado = gerador.nextInt(1,6);
        System.out.println("Dice spinning...");
        System.out.println("The result is: " + dadoGerado);
    }
}
