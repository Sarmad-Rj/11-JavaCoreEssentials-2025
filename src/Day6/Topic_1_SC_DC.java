package Day6;

import java.util.Arrays;

public class Topic_1_SC_DC {
    public static void main(String[] args) {
        // Shallow and Deep Copy of Array

        int[] array1 = {1, 2, 3};
        int[] array2 = array1; // Shallow Copy

        System.out.println("Array1: " + Arrays.toString(array1));
        array1[0] = 99;
        System.out.println("Array1 after update: " + Arrays.toString(array1));
        System.out.println("Shallow Copy of Array1: " + Arrays.toString(array2));

        String[] Fruits1 = {"Apple", "Mango", "Cherry"};
        String[] Fruits2 = Fruits1.clone(); //Deep Copy

        System.out.println("\nFruits Array1: " + Arrays.toString(Fruits1));
        Fruits1[0] = "Pineapple";
        System.out.println("Fruits Array1 after update: " + Arrays.toString(Fruits1));
        System.out.println("Deep Copy of Array1: " + Arrays.toString(Fruits2));
    }
}
