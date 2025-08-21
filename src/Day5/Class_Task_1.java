package Day5;

import java.util.Scanner;

public class Class_Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        sentence = sentence.toLowerCase();

        int vowelCount = 0;

        for (char c : sentence.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Your sentence contains " + vowelCount + " vowel(s)");

        sc.close();
    }
}
