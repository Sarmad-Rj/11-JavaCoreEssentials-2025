package Day2;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        int grade = 75;
        if (grade >= 90) {
            System.out.println("Grade: A");
        } else if (grade >= 80) {
            System.out.println("Grade: B");
        } else if (grade >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // Print odd numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println("Odd: " + i);
        }

        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();
        } while (number <= 0);
        System.out.println("You entered: " + number);
        scanner.close();

//        unary op, post fix and prefix
    }
}
