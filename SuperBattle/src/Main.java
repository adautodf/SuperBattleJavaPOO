import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        // statement
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();

        menu.Introduction();
        menu.escolha(sc.nextInt());
    }
}