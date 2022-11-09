package C03_Statements;

public class IfStatements {

    public static void main(String[] args) {
        boolean comparison = 3 > 6;
        boolean notEquals = 3 != 4;
        boolean equals = 4 == 4;

        System.out.println(comparison);
        System.out.println(notEquals);
        System.out.println(equals);

        int valor = 9;
        if(valor!=10) {
            System.out.println("Right");
        }
        else if(valor > 1) {
            System.out.println("Right2");
        }
        else {
            System.out.println("Lie");
        }

        int dato = 4;
        while(true) {
            System.out.println("Inside");

            if(dato == 5) {
                break;
            }
            dato++;
            System.out.println("Outside");
        }
    }
}