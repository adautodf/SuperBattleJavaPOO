import Ascii.*;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Round extends Game {

    // Statement
    static Menu menu = new Menu();
    static Scanner sc = new Scanner(System.in);
    static Game game = new Game();
    static String playerOficial;
    static AsciiMuqueMan asciiMuqueMan = new AsciiMuqueMan();
    static AsciiRaioLaser asciiRaioLaser = new AsciiRaioLaser();
    static AsciiRelampago asciiRelampago = new AsciiRelampago();
    static int life = 200;
    static int lifeAlien = 200;
    static MuqueMan muqueMan = new MuqueMan();
    static Alien alien = new Alien();
    static RaioLaser raioLaser = new RaioLaser();
    static Relampago relampago = new Relampago();
    static AsciiPlanetaSeguro asciiPlanetaSeguro = new AsciiPlanetaSeguro();
    static AsciiAlienBro asciiAlienBro = new AsciiAlienBro();
    static AsciiAlienChegando asciiAlienChegando = new AsciiAlienChegando();
    static AsciiPlanetaDestruido asciiPlanetaDestruido = new AsciiPlanetaDestruido();
    static AsciiLoser asciiLoser = new AsciiLoser();
    static ConditionBackToMenu conditionBackToMenu = new ConditionBackToMenu();


    public static String choosePlayer() throws FileNotFoundException, InterruptedException {
        restartLife();
        System.out.println("-> Choose your player.");
        System.out.println("--------------------------------------------------------------------------------------");
        asciiMuqueMan.asciiPrint();
        System.out.println("--------------------------------------------------------------------------------------");
        asciiRaioLaser.asciiPrint();
        System.out.println("--------------------------------------------------------------------------------------");
        asciiRelampago.asciiPrint();
        System.out.println("--------------------------------------------------------------------------------------");

        int choosePlayer = sc.nextInt();
        if (choosePlayer == 1){
            playerOficial = "Muque-Man";
        } else if (choosePlayer == 2) {
            playerOficial = "Raio-Laser";
        } else if (choosePlayer == 3) {
            playerOficial = "Relâmpago";
        }
        return playerOficial;
    }

    public static RoundDTO conditionLife(RoundDTO roundDTO, int roundNumber) throws FileNotFoundException, InterruptedException {
        if (roundDTO.life <= 0){
            asciiLoser.asciiLoserPrint();
            System.out.println("You Lost, Winner is Alien");
            roundDTO.continua = false;
            conditionBackToMenu.conditionBackToMenuAction();

        } else if (roundDTO.lifeAlien <= 0){
            System.out.println("Congratulations, you are Winner, " + roundDTO.playerOficial);
            asciiPlanetaSeguro.asciiPrint();
            roundDTO.continua = false;
            conditionBackToMenu.conditionBackToMenuAction();

        } else if (roundNumber == 6){
            roundDTO.continua = false;
            System.out.println("Game Over");
            if (life > lifeAlien){
                System.out.println("Congratulations, you are Winner, " + roundDTO.playerOficial);
                asciiPlanetaSeguro.asciiPrint();
            } else if (life == lifeAlien){
                System.out.println("tie! there was no winner.");
            } else {
                asciiLoser.asciiLoserPrint();
                System.out.println("You lost. Winner is Alien");
            }
            conditionBackToMenu.conditionBackToMenuAction();

        }
        return roundDTO;
    }

    public static RoundDTO startRound(RoundDTO roundDTO, int roundNumber) throws FileNotFoundException, InterruptedException {

        System.out.println("It's time for " + playerOficial + "\n");
        game.rolaDado();

        if (dadoGerado == 1 || dadoGerado == 2){
           System.out.println("\n" + playerOficial + " used the attack");
           if(playerOficial.equals("Muque-Man")){
               muqueMan.getNameFirstAttack();
           } else if (playerOficial.equals("Raio-Laser")){
               raioLaser.getNameFirstAttack();
           } else if (playerOficial.equals("Relâmpago")){
               relampago.getNameFirstAttack();
           }
           lifeAlien = lifeAlien - 10;
            System.out.println("in Alien. Now, Alien's life is:" + lifeAlien + "\n");
        } else if (dadoGerado == 3 || dadoGerado == 4 || dadoGerado == 5){
            System.out.println("\n" + playerOficial + " used the attack");
            if(playerOficial.equals("Muque-Man")){
                muqueMan.getNameSecondAttack();
            } else if (playerOficial.equals("Raio-Laser")){
                raioLaser.getNameSecondAttack();
            } else if (playerOficial.equals("Relâmpago")){
                relampago.getNameSecondAttack();
            }
            lifeAlien = lifeAlien - 20;
            System.out.println("in Alien. Now, Alien's life is:" + lifeAlien + "\n");
        } else if (dadoGerado == 6){
            System.out.println("\n" + playerOficial + " used the attack");
            if(playerOficial.equals("Muque-Man")){
                muqueMan.getNameThirdAttack();
            } else if (playerOficial.equals("Raio-Laser")){
                raioLaser.getNameThirdAttack();
            } else if (playerOficial.equals("Relâmpago")){
                relampago.getNameThirdAttack();
            }
            lifeAlien = lifeAlien - 40;
            System.out.println("in Alien. Now, Alien's life is:" + lifeAlien + "\n");
        }

        System.out.println("It's time for Alien\n");
        rolaDado();

        if (dadoGerado == 1 || dadoGerado == 2){
            System.out.println("\nAlien used the attack");
            alien.getNameFirstAttack();
            life = life - 10;
            System.out.println("in " + playerOficial + " Now, " + playerOficial + " life is: " + life);
            System.out.println("Alien's life is:" + lifeAlien + "\n");
        } else if (dadoGerado == 3 || dadoGerado == 4 || dadoGerado == 5){
            System.out.println("\nAlien used the attack");
            alien.getNameSecondAttack();
            life = life - 20;
            System.out.println("in " + playerOficial + " Now, " + playerOficial + " life is: " + life);
            System.out.println("Alien's life is:" + lifeAlien + "\n");
        } else if (dadoGerado == 6){
            System.out.println("\nAlien used the attack");
            alien.getNameThirdAttack();
            life = life - 40;
            System.out.println("in " + playerOficial + " Now, " + playerOficial + " life is: " + life);
            System.out.println("Alien's life is:" + lifeAlien + "\n");
        }

        roundDTO = new RoundDTO(life, lifeAlien, playerOficial, true);
        return conditionLife(roundDTO, roundNumber);
    }

    public static void restartLife(){
        life = 200;
        lifeAlien = 200;
    }
}
