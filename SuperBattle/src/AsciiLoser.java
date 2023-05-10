import java.io.File;
import java.io.FileNotFoundException;

public class AsciiLoser {
    // Statement
    static Ascii ascii = new Ascii();

    public void asciiLoserPrint() throws FileNotFoundException, InterruptedException {
        try {
            ascii.asciiPrint(new File("src\\Ascii\\alienBro.txt"));
            ascii.asciiPrint(new File("src\\Ascii\\alienchegando.txt"));
            ascii.asciiPrint(new File("src\\Ascii\\planetaDestruido.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Error.");
        } catch (InterruptedException e) {
            System.out.println("Error.");
        }
    }
}
