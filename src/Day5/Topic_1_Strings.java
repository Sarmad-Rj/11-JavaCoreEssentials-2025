package Day5;

public class Topic_1_Strings {
    public static void main(String[] args) {

        // -------------------------------
        // String creation and printing
        // -------------------------------
        String name0 = "ALI"; // literal string
        System.out.println(name0);

        // Update string value
        name0 = "AHAMD and SIBTAIN";
        System.out.println(name0);

        String name1 = new String("AHMAD"); // new String object


        // -------------------------------
        // Common String methods
        // -------------------------------

        // length()
        System.out.println("Length of name0: " + name0.length());

        // charAt()
        System.out.println("Character at index 0: " + name0.charAt(0));

        // indexOf()
        System.out.println("Index of 'A': " + name0.indexOf('A'));

        // substring()
        System.out.println("Substring (10,17): " + name0.substring(10, 17));


        // -------------------------------
        // equals() and ==
        // -------------------------------
        String Tname  = "ALI";
        String Tname1 = "ALI";

        System.out.println("Tname == Tname1: " + (Tname == Tname1));  // reference check
        System.out.println("Tname.equals(Tname1): " + Tname.equals(Tname1)); // value check
        System.out.println("Tname.equalsIgnoreCase(Tname1): " + Tname.equalsIgnoreCase(Tname1));


        // -------------------------------
        // contains(), endsWith()
        // -------------------------------
        String email  = "ali123@gmail.com";
        String email1 = "ali123gmail.com";

         System.out.println(email.contains("@")); // would return true
        System.out.println("Does email1 end with '@gmail.com'? " + email1.endsWith("@gmail.com"));


        // -------------------------------
        // concat() and +
        // -------------------------------
        System.out.println("Concatenation with + : " + ("SARMAD" + " IKRAM"));
        System.out.println("Concatenation with concat(): " + "SARMAD".concat(" IKRAM"));


        // -------------------------------
        // toLowerCase(), toUpperCase()
        // -------------------------------
        System.out.println("Lowercase: " + "SARMAD".toLowerCase());
        System.out.println("Uppercase: " + "sarmad".toUpperCase());


        // -------------------------------
        // trim()
        // -------------------------------
        System.out.println("Trimmed string: '" + "    test     ".trim() + "'");


        // -------------------------------
        // StringBuilder methods
        // -------------------------------
        StringBuilder name = new StringBuilder("ali");

        // append()
        System.out.println("Append: " + name.append(" and ahmad"));

        // insert()
        System.out.println("Insert: " + name.insert(3, " and ahmad"));
    }
}
