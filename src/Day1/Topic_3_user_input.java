package Day1;

import java.util.Scanner;

public class Topic_3_user_input {
    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Predefined name
        String name1 = "Zoha";
        System.out.println("Predefined name: " + name1);

        // Ask user for their name
        System.out.print("What is your name? ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");

        // Ask user for their age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("You are " + age + " years old.");

        // Ask user if they like Java
        System.out.print("Do you like Java? (true/false): ");
        boolean likesJava = sc.nextBoolean();
        System.out.println("Likes Java: " + likesJava);

        // ✅ Close the scanner to avoid resource leak
        sc.close();
    }
}