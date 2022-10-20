package C01_VariablesAndOperators;

public class Operators {
    public static void main(String[] args) {
        //Logical operators
        boolean isStudent = true;
        boolean isTall = false;

        System.out.println(isStudent && isTall); //All must be true, otherwise is false (AND)
        System.out.println(isStudent || isTall); //If there are any true, it's true, otherwise is false (OR)
        System.out.println(!isStudent || isTall); //The operator ! flip the value (NOT)

    }
}
