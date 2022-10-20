package C03_Statements;

public class TernaryOperators {

    public static void main(String[] args) {

        int age = 15;
        if (age <= 17) {
            System.out.println("You aren't an adult");
        } else {
            System.out.println("You are an adult");
        }

        ////////
        String message = age <= 17 ? "You aren't an adult" : "You are an adult";
        System.out.println(message);
    }
}
