package ClassesObjectsConstructors;

class Methods{
    String player;
    String condition;
    int number;
    void Tuchel() {
        System.out.println("Injured");
        for(int i=0; i<3; i++){
            System.out.println("Chelsea player " + player + ", Number " + number + ", is currently " + condition + " for tomorrow's game");
        }
    }
    void Mister() {
        System.out.println("Tuchel said: ");
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {

        Methods name = new Methods();
        name.player = "Rudiger";
        name.number = 3;
        name.condition = "available";
        name.Mister();
        name.Tuchel();
    }
}
