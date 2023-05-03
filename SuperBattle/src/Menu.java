import Ascii.AsciiSuperBattle;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu {
    // Statement
    private static Scanner sc = new Scanner(System.in);
    AsciiSuperBattle asciiInitial = new AsciiSuperBattle();
    Round round = new Round();
    public static int life;
    public static int lifeAlien;
    public static String playerOficial;
    GameGeneral game = new GameGeneral();

    public void Introduction() throws FileNotFoundException, InterruptedException {
        asciiInitial.asciiPrint();
        System.out.println("\n---------------- MENU -----------------\n");
        System.out.println(" [01]  PLAY \n [02]  SEE ABOUT \n [03]  EXIT\n \n Game developed by @adautodf (instagram)\n");
    }

    public int escolha(int choose) throws FileNotFoundException, InterruptedException {
        switch (choose) {
            case 1 -> {
                System.out.println("\nNice choose! Let's go to play.\n");
                game.gameGeneralStart();
                return 1;
            }
            case 2 -> {
                System.out.println("Nice choose!\n" +
                        "I am glad you are interested in knowing more about the game!  The game was developed by the\n" +
                        "student Francisco Adauto Canuto Dorta Filho, of the Object Oriented Programming course of the\n" +
                        "Computer Science course at the University of Fortaleza (Unifor).\n" +
                        "We intend the game development to practice and exercise the lessons learned in class, such as\n" +
                        "the use of classes, hierarchy, abstraction and everything related to the subject.\n" +
                        "In SuperBattle game you will have the possibility to choose between 3 characters. With\n" +
                        "6 rounds, the winner is the one who survives until the end of the game or the one who has\n" +
                        "more life in the final battle.\nThat's it :)\n");
                System.out.println("Now, let's go to return a meny! Type "+ "play " + "when you are ready.");
                String resposta = sc.next();
                if(resposta.equals("play")){
                    System.out.println("Great game :)\n");
                    game.gameGeneralStart();
                } else {
                    System.out.println("Invalid option.\nPlease choose another option.");
                    String respostaAlternativa = sc.next();
                    if (respostaAlternativa.equals("play")){
                        System.out.println("Great game :)\n");
                        game.gameGeneralStart();
                    } else {
                        System.out.println("Error. Try again later.");
                    }
                }
                return 2;
            }
            case 3 -> {
                System.out.println("Exiting...");
                return 3;
            }
            default -> {
                System.out.println("Invalid option.\nPlease choose another option.");
                return escolha(sc.nextInt());
            }
        }
    }
}


