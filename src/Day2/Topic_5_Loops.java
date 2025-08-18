package Day2;

public class Topic_5_Loops {

    public static void main(String[] args) {

        // --- For Loop ---
        // A basic for loop to print numbers from 1 to 10.
        // It's ideal when you know the number of iterations in advance.
        System.out.println("--- For Loop: Numbers 1 to 10 ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("--- Nested For Loop: 10 x 10 Grid ---");
        // --- Nested For Loop ---
        // The outer loop handles the rows, and the inner loop handles the columns.
        for (int i = 1; i <= 10; i++) { // Outer loop for rows
            for (int j = 1; j <= 10; j++) { // Inner loop for columns
                System.out.print("* "); // Prints a star and a space without a new line
            }
            System.out.println(); // Moves to the next line after each row is complete
        }
        System.out.println();

        System.out.println("--- Do-While Loop ---");
        // --- Do-While Loop ---
        // The loop body executes at least once before the condition is checked.
        // The condition (i <= 10) is false initially, so it runs once and exits.
        int i = 20;
        do {
            System.out.print("@");
            i++;
        } while (i <= 10);
        System.out.println();

        System.out.println("--- While Loop ---");
        // --- While Loop ---
        // The condition is checked first. Since (j <= 10) is false, the loop never runs.
        int j = 20;
        while (j <= 10) {
            System.out.print("#");
            j++; // Note: 'i' was mistakenly used here in the original code. Corrected to 'j'.
        }
        System.out.println();

        System.out.println("--- For Loop with 'continue' ---");
        // --- For Loop with 'continue' Statement ---
        // 'continue' skips the rest of the current iteration and proceeds to the next one.
        // This loop prints only the odd numbers from 1 to 10.
        for (int k = 1; k <= 10; k++) {
            if (k % 2 == 0) { 
                continue; // Skips to the next iteration if the number is even
            }
            System.out.println("Odd: " + k);
        }
    }
}