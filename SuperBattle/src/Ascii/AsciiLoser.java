package Ascii;

import java.io.FileNotFoundException;

public class AsciiLoser {
    // Statement
    static AsciiAlienBro asciiAlienBro = new AsciiAlienBro();
    static AsciiAlienChegando asciiAlienChegando = new AsciiAlienChegando();
    static AsciiPlanetaDestruido asciiPlanetaDestruido = new AsciiPlanetaDestruido();

    public void asciiLoserPrint() throws FileNotFoundException, InterruptedException {
        asciiAlienBro.asciiPrint();
        asciiAlienChegando.asciiPrint();
        asciiPlanetaDestruido.asciiPrint();
    }
}
