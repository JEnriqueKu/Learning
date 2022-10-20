package C02_Loops;

import java.util.Scanner;

public class WhileLoops {
    //Add comments
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int number;
        do {
            System.out.println("Guess the number");
            number = value.nextInt();
        }

        while (number != 9);
        System.out.println("It´s 9");
    }
}