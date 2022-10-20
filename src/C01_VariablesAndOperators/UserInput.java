package C01_VariablesAndOperators;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.println("Type your Line");
        String text = x.nextLine();

        System.out.println("your Line is: " + text);

        Scanner y = new Scanner(System.in);

        System.out.println("Type your value");
        int value = y.nextInt();
        System.out.println("Your value is: " + value);
    }
}
