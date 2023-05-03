package Ascii;

import Ascii.Ascii;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AsciiPlanetaDestruido extends Ascii {

    @Override
    public void asciiPrint() throws FileNotFoundException, InterruptedException {
        File file = new File("ascii\\planetaDestruido.txt");
        Scanner reader = new Scanner(file);
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            System.out.println(line);
            Thread.sleep(54);
        }
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("");
    }
}
