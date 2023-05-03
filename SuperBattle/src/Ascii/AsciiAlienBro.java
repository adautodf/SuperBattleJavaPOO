package Ascii;

import Ascii.Ascii;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AsciiAlienBro extends Ascii {

    @Override
    public void asciiPrint() throws FileNotFoundException, InterruptedException {
        File file = new File("C:\\Users\\Adauto\\Desktop\\Faculdade\\2 semestre\\P.O.O Java\\Trabalho AV2\\ascii\\alienBro.txt");
        Scanner reader = new Scanner(file);
        System.out.println("--------------------------------------------------------------------------------------");
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            System.out.println(line);
            Thread.sleep(54);
        }
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("");
    }
}
