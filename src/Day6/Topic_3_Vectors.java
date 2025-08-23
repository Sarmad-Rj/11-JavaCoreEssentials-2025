package Day6;

import java.util.Vector;

public class Topic_3_Vectors {
    public static void main(String[] args) {
        Vector<String> v1 = new Vector<>();
        v1.add("AHMAD");
        v1.add("SARMAD");

        Vector<String> v2 = new Vector<>(); // Deep Copy
        for (String s : v1) {
            v2.add(new String(s));
        }

        // Modify original
        v1.set(0, "IKRAM");

        System.out.println("Original: " + v1);
        System.out.println("Deep Copy: " + v2);
    }
}
