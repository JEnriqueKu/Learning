package C04_Array;

public class LoopsOfArray {
    public static void main(String[] args) {

        String[] names = {"Ken","Lucy","Lin","Bob"};

        for (String name : names) {
            if (name.equals("Lucy")){
                continue;
            }
            System.out.println(name);
        }
        System.out.println("");
        for (String name : names) {
            if (name.startsWith("L")){
                continue;
            }
            System.out.println(name);
        }
    }
}
