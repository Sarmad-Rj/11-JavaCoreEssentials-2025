package Day2;

public class Topic_4_Conditional_Statements {
    public static void main(String[] args) {

        // --- If-Else Statement ---
        int a = 3;
        if (a > 0) {
            System.out.println("Login..");
        } else {
            System.out.println("Failed to login");
        }

        // --- Simplified If Statement ---
        // If a single statement follows an if-condition, braces aren't required.
        if (true)
            System.out.println("Second way");

        // --- Switch Statement ---
        switch(a){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday"); // This case matches the value of 'a'.
                break; // stop here and wont run the next blocks
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Wrong input");
        }

        // --- Ternary Operator ---
        // A shorthand for a simple if-else statement.
        // It's in the format: condition ? value_if_true : value_if_false;
        int age = 20;
        String isAdult  = ( age >= 18 ) ? "Is adult." : "not an adult" ;
        System.out.println(isAdult); // Prints "Is adult."
    }
}