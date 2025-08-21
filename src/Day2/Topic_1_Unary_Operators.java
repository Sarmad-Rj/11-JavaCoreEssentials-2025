package Day2;

public class Topic_1_Unary_Operators {

    public static void main(String[] args) {

        // --- Post-Increment Operator (a++) ---
        System.out.println("--- Post-Increment Operator (a++) ---");
        int a = 5;
        System.out.println("Initial value of 'a': " + a);

        int b = a++;
        System.out.println("Value of 'b' after b = a++: " + b); // Prints 5
        System.out.println("New value of 'a' after the operation: " + a); // Prints 6

        System.out.println();

        // --- Pre-Increment Operator (++c) ---
        System.out.println("--- Pre-Increment Operator (++c) ---");
        int c = 5;
        System.out.println("Initial value of 'c': " + c);

        int d = ++c;
        System.out.println("Value of 'd' after d = ++c: " + d); // Prints 6
        System.out.println("New value of 'c' after the operation: " + c); // Prints 6
    }
}