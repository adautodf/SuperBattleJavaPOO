package Ascii;

import Ascii.Ascii;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AsciiPlanetaSeguro extends Ascii {

    @Override
    public void asciiPrint() throws FileNotFoundException, InterruptedException {
        File file = new File("ascii\\planetaSeguro.txt");
        Scanner reader = new Scanner(file);
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            System.out.println(line);
            Thread.sleep(54);
        }
        System.out.println("-------------------------------------------");
        System.out.println("");
    }
}
