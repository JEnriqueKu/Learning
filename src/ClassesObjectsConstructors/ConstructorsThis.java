package ClassesObjectsConstructors;

class Program{
    int valor;
    String text;

    public Program(){
        System.out.println("constructor");
        valor = 4;
        System.out.println(valor);
    }
    public Program(int valor){

        this.valor = valor;
        System.out.println("\nconstructor #2");
        System.out.println(valor);
    }
    public Program(int valor, String texto){
        this.valor = valor;
        texto = "hola";
        System.out.println("\nconstructor #3");
        System.out.println(valor);
    }
}

public class ConstructorsThis {
    public static void main(String[] args) {

        Program miprograma = new Program();
        new Program();
        Program miprograma2 = new Program(5);
        Program miprograma3 = new Program(4, "F");
        Program miprograma4 = new Program();
    }
}
