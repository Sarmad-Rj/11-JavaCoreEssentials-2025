package Day2;

public class Topic_1_Unary_Operators {

    public static void main(String[] args) {

        // --- Post-Increment Operator (a++) ---
        // The value is first assigned to the variable, then incremented.
        System.out.println("--- Post-Increment Operator (a++) ---");
        int a = 5;
        System.out.println("Initial value of 'a': " + a);

        // 'b' is assigned the current value of 'a' (5).
        // Then, 'a' is incremented to 6.
        int b = a++;
        System.out.println("Value of 'b' after b = a++: " + b); // Prints 5
        System.out.println("New value of 'a' after the operation: " + a); // Prints 6

        System.out.println(); // Adds a blank line for readability

        // --- Pre-Increment Operator (++c) ---
        // The value is first incremented, then assigned to the variable.
        System.out.println("--- Pre-Increment Operator (++c) ---");
        int c = 5;
        System.out.println("Initial value of 'c': " + c);

        // 'c' is first incremented to 6.
        // Then, the new value of 'c' (6) is assigned to 'd'.
        int d = ++c;
        System.out.println("Value of 'd' after d = ++c: " + d); // Prints 6
        System.out.println("New value of 'c' after the operation: " + c); // Prints 6
    }
}