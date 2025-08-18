package Day2;

public class Topic_3_Enumeration {

    // Define an enum named 'Day' outside the main method.
    // Enums are a special type of class that represents a group of constants.
    enum Day {
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday
    }

    public static void main(String[] args) {
        int a = 5;

        // Assigning a specific enum constant to a variable.
        Day b = Day.Tuesday;
        System.out.println(b); // Prints "Tuesday"

        // Printing all enum constants one by one.
        System.out.println(Day.Monday);
        System.out.println(Day.Tuesday);
        System.out.println(Day.Wednesday);
        System.out.println(Day.Thursday);
        System.out.println(Day.Friday);
        System.out.println(Day.Saturday);
        System.out.println(Day.Sunday);
    }
}