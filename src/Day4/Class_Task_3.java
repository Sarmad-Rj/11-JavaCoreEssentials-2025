package Day4;

import java.util.Scanner;

public class Class_Task_3 {
    public static void table(int tableOf) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(tableOf + " x " + i + " = " + (tableOf * i));
        }

    }

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        Scanner name = new Scanner(System.in);
        System.out.println("Enter a number to get the table: ");
        int tableOf = name.nextInt();

        table(tableOf);
        System.out.printf("Time: " + ((System.currentTimeMillis()) - start) + "ms");

    }
}
