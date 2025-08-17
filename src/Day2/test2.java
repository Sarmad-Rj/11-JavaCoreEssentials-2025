package Day2;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter subject marks");
        int Sub1=sc.nextInt();
        int Sub2=sc.nextInt();
        int Sub3=sc.nextInt();
        int Sub4=sc.nextInt();
        int Sub5=sc.nextInt();
        System.out.println("total Gain marks:");
        int sum = Sub1+Sub2+Sub3+Sub4+Sub5;
        System.out.println("percentage:");
        System.out.println((sum * 100) / 250);


        int x, y,z;
        x=y=z=10;

    }
}
