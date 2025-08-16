package Day1;

import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        sc.nextInt();
//        sc.nextBoolean();
        String name1 = "Zoha";
        System.out.println(name1);

        System.out.println("What is Your name?");
        String name = sc.nextLine();
        System.out.println(name);
    }
}
