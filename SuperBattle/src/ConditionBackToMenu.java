import java.io.FileNotFoundException;
import java.util.Scanner;
public class ConditionBackToMenu {
    Menu menu = new Menu();
    Scanner sc = new Scanner(System.in);

    public void conditionBackToMenuAction() throws FileNotFoundException, InterruptedException {
        System.out.println("Would you like to go back to the Menu? yes or no.");
        String resposta = sc.next();
        if (resposta.equals("yes")){
            menu.Introduction();
            int choose = menu.escolha(sc.nextInt());
        } else if (resposta.equals("no")){}
    }

}
