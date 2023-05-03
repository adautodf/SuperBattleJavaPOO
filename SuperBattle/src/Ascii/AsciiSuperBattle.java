package Ascii;

import Ascii.Ascii;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AsciiSuperBattle extends Ascii {
    @Override
    public void asciiPrint() throws FileNotFoundException, InterruptedException {
        File file = new File("ascii\\superBattle.txt");
        Scanner reader = new Scanner(file);
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            System.out.println(line);
            Thread.sleep(54);
        }
    }
}
