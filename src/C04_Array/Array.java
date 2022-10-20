package C04_Array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        System.out.println(numbers[0]+"\n");

        numbers[0] = 15;
        numbers[1] = 14;
        numbers[2] = 8;
        numbers[3] = 7;
        numbers[4] = 0;
        //Igual se puede expresar int[] numbers = {15,14,8,7,0};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4] + "\n");

        System.out.println(numbers + "\n");

        for(int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("");

        //easier way (autocompletes)=>    numbers.for

        for (int number: numbers){
            System.out.println(number);
        }
        System.out.println("");

        //other way (stream)
        Arrays.stream(numbers).forEach(System.out::println);
    }
}
