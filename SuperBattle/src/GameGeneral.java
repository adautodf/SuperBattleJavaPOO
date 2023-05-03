import java.io.FileNotFoundException;
import java.util.Scanner;

public class GameGeneral {

    Scanner sc = new Scanner(System.in);
    public void gameGeneralStart() throws FileNotFoundException, InterruptedException {
        RoundDTO roundDTO = new RoundDTO(200, 200, Round.choosePlayer(),true);
        for (int i = 1 ; i <= 6 ; i++){
            System.out.println("\nRound " + i +" - "  + roundDTO.playerOficial + " x Alien");
            System.out.println("Life (" + roundDTO.playerOficial + "): " + roundDTO.life);
            System.out.println("Life (Alien): " + roundDTO.lifeAlien + "\n");
            roundDTO = Round.startRound(roundDTO, i);
            if (roundDTO.continua){
                System.out.println("You want to continue the game? Type ok");
                String verificaContinua = sc.next();
                if (!verificaContinua.equalsIgnoreCase("OK")){
                    i = 10;
                }
            } else {
                i = 10;
            }
        }
    }
}
