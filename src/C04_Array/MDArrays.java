package C04_Array;

public class MDArrays {
    public static void main(String[] args) {

        int[] ArrayOD = {4, 8, 14, 24, 44};
        System.out.println(ArrayOD[1]);

        int[][] ArrayMD = {{4, 8, 14, 24, 44}, {1, 3, 5}, {56, 78, 99}, {44, 88, 77}};
        System.out.println(ArrayMD[3][0]);

        double[][] dArray = new double[4][3];

        System.out.println(dArray[1][0]);

        for (int array = 0; array < ArrayMD.length; array++) {
            for (int item = 0; item < ArrayMD[array].length; item++) {
                System.out.print(ArrayMD[array][item] + "\t");
            }
            System.out.println();
        }
        for (int array1 = 0; array1 < dArray.length; array1++) {
            for (int item = 0; item < dArray[array1].length; item++) {
                System.out.print(dArray[array1][item] + "\t");
            }
            System.out.println();
        }
    }
}
