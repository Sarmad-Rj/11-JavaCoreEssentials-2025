package Day1;

public class Topic_2_Data_types {
    public static void main(String[] args) {

        // Boolean type
        boolean isAvailable = true;

        // Byte type (range: -128 to 127)
        byte byteA = 127;
        byte byteB = 4;

        // Short type (range: -32,768 to 32,767)
        short shortVal = 32000;

        // Integer type
        int num1 = 545;
        int num2 = 5;
        int sum = num1 + num2;

        System.out.println("Sum using variable: " + sum);
        System.out.println("Sum directly: " + (num1 + num2));

        // Long type (add 'L' at the end)
        long longVal = 1234567890123456789L;

        // Float type (add 'f' at the end)
        float floatVal = 1.123456789f;

        // Double type (higher precision)
        double doubleVal = 1.2234567876543212345678765432;

        System.out.println("Float value: " + floatVal);
        System.out.println("Double value: " + doubleVal);

        // Character type
        char grade = '@';

        // String (non-primitive type)
        String name = "Sarmad";

        // Displaying all values
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Long value: " + longVal);
        System.out.println("Short value: " + shortVal);
    }
}