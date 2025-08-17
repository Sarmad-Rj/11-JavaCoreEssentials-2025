package Day2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int x = 5;
        int y = ++x;
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        int a = 5;
        int b = x++;
        System.out.println("x: " + a);
        System.out.println("y: " + b);

        Scanner sc = new Scanner(System.in);

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

        sc.close();

    }
}
//
//public class TryEnumeration {
//    // Define an enumeration type for days of the week
//    enum Day {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday }
//
//    public static void main(String[] args) {
//// Define three variables of type Day
//        Day yesterday = Day.Thursday;
//        Day today = Day.Friday;
//        Day tomorrow = Day.Saturday;
//
//// Output the values of the Day variables
////        System.out.println(“Today is “ + today);
////        System.out.println(“Tomorrow will be “ + tomorrow);
////        System.out.println(“Yesterday was “ + yesterday);
//    }}
