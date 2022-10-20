package ClassesObjectsConstructors;

class nueva{
    public String numero1;
    public static String numero2;
    public static int count = 0;
    public nueva(){
        count++;
    }
    public void nombre(){
        System.out.println(numero1 + " está en el servivio de " + numero2 + count);
    }
    public static void Info(){
        System.out.println("Pasante");
    }
}

public class FinalAndKeyword {
    public static void main(String[] args) {
        nueva.numero2 = "Hiper";
        System.out.println(nueva.numero2);

        System.out.println("antes " + nueva.count);

        nueva.Info();

        nueva Student1 = new nueva();
        System.out.println(nueva.count);
        Student1.nombre();
        nueva Student2 = new nueva();

        Student1.numero1 = "Enrique";
        Student2.numero1 = "Celeste";

        Student1.nombre();
        Student2.nombre();

        nueva.Info();

        System.out.println("despues" + nueva.count);
    }
}
