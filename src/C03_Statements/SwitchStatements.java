package C03_Statements;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Variables supported char, byte, short, int, string.

        System.out.println("You like dogs or cats?");
        String text = input.nextLine();

        switch (text) {
            case "Cats":
                System.out.println("I don't");
                break;
            case "Dogs":
                System.out.println("Ohh I have one too");
                break;
            default:
                System.out.println("I didn't ask for birds");
                break;
        }
    }
}
