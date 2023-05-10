import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ascii {

    public void asciiPrint(File file) throws FileNotFoundException, InterruptedException {
        Scanner reader = new Scanner(file);
        //System.out.println("--------------------------------------------------------------------------------------");
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            System.out.println(line);
            Thread.sleep(54);
        }
        //System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("");
    }

}
