import org.omg.CORBA.PRIVATE_MEMBER;

import java.util.Objects;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Please make sure to enter every response exactly as asked");
        Prints.m();
        System.out.println("For the choices below press (some value) then enter");
        Prints.m();
        System.out.println("If the response isn't typed exactly as what the computer has asked you the game will exit ");
        System.out.println("(1) --> Start");
        System.out.println("(2) --> Learn about project");
        System.out.println("(3) --> Print Summary Statement");
        System.out.println("(4) --> Quit");
        Scanner user = new Scanner(System.in);
        String inp = user.nextLine();

        if(Objects.equals(inp,"1")) Prints.runGame();
        else if(Objects.equals(inp,"2")) Prints.learnProject();
        else if(Objects.equals(inp,"3")) Prints.summaryStatement();
        else if(Objects.equals(inp,"4")) System.exit(0);
    }
}
