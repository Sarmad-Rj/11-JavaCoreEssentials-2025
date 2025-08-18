package Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic_1_Arrays {
    public static void main(String[] args) {

        final int a = 6; // constant
        System.out.println(a);

        // array declarations
        int number[];
        int[] number1;
        byte[] numbers3;
        String[] names1;

        // array initialization
        String[] fruits = new String[5];
        int[] numbers = new int[5];
        boolean[] isON = new boolean[5];

        // assign fruits
        fruits[0] = "Apple";
        fruits[1] = "Mango";
        fruits[2] = "Cherry";
        fruits[3] = "Pineapple";

        // print fruits
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        // Default value, at 4th index will be?

        // print numbers
        for (int n : numbers) {
            System.out.println(n);
        }
        // it will print the default values bcz it is empty

        // print booleans
        for (boolean m : isON) {
            System.out.println(m);
        }

        // string array
        String[] names = {"SARMAD", "AHMAD", "ALI"};

        // access index
        System.out.println(names[1]);

        // length
        int l = names.length;
        System.out.println(names.length);
        System.out.println("Length of names array: " + l);

        // update element -> Means? The arrays are mutable.
        names[1] = "ZOHA";

        // print names
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // print arrays
        System.out.println(Arrays.toString(numbers));
        System.out.println(names[2]);

    }
}
