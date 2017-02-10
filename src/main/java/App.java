/**
 * Created by Hanna_Zhahala on 07.02.2017.
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        String name = new App().readName();
        System.out.println("Hello " + name);
    }

    public String readName() {
        String s = "What is your name?";

        System.out.println(s);

        Scanner in = new Scanner(System.in);


        return in.nextLine();
    }
}