package Day3;

import java.util.Scanner;

public class Class_Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter any 5 digits: ");
//        numbers[0] = sc.nextInt(); //cin
//        numbers[1] = sc.nextInt();
//        numbers[2] = sc.nextInt();
//        numbers[3] = sc.nextInt();
//        numbers[4] = sc.nextInt();
//
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);
//        System.out.println(numbers[4]);

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

//        System.out.println(i);

        System.out.println("Total sum is: " + sum);
        int avg = sum / numbers.length;
        System.out.println("Avg is: " + avg);

//        sum = 0,  sum = 0 + 15
//        sum = 15, sum = 15 + 30
//        sum = 45, sum = ...

    }
}
