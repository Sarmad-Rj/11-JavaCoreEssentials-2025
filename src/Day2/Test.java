package Day2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int grade = 75;
        if (grade >= 90) {
            System.out.println("Grade: A");
        } else if (grade >= 80) {
            System.out.println("Grade: B");
        } else if (grade >= 70) {
            System.out.println("Grade: C"); // This condition is met
        } else {
            System.out.println("Grade: F");
        }


        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a positive number: ");
            number = sc.nextInt();
        } while (number <= 0);
        System.out.println("You entered: " + number);



        // Input
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        // Switch-case
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                if (Character.isLetter(ch)) {
                    System.out.println(ch + " is a consonant.");
                } else {
                    System.out.println("Invalid input. Please enter an alphabet.");
                }
        }


        int x = 5;
        int y = ++x;
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        int a = 5;
        int b = x++;
        System.out.println("x: " + a);
        System.out.println("y: " + b);

        sc.close();
    }
}
