package Day2;

import java.sql.SQLOutput;

public class Cond_stmts {
    public static void main(String[] args) {
        int a = 3;
        if (a > 0) {
            System.out.println("Login..");
        } else {
            System.out.println("Failed to login");
        }

        if (true)
            System.out.println("Second way");

        switch(a){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Wrong input");

        }
        int age = 20;
        String isAdult  = ( age >= 18 ) ? "Is adult." : "not an adult" ;
        System.out.println(isAdult);
    }
}
