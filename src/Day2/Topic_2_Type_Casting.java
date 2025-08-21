package Day2;

public class Topic_2_Type_Casting {
    public static void main(String[] args) {

        // --- Widening (Implicit) Type Casting ---
        // A smaller data type (byte) is assigned to a larger data type (int).
        byte a = 5;
        int b = a;

        // --- Narrowing (Explicit) Type Casting ---
        // A larger data type (double) is explicitly cast to a smaller data type (byte).
        // Data loss may occur.
        double c = 12.5d;
        int d = (byte) c;

        // --- Narrowing (Explicit) Type Casting with float ---
        // A float is explicitly cast to a byte. The decimal part is truncated.
        float x = 10.9f;
        byte y = (byte) x;
        System.out.println(y); // Prints 10
    }
}