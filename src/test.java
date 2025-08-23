import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class test {
    public static void main(String[] args) {
        // Create a List first
        List<String> list = new ArrayList<>();
        list.add("Ahmad");
        list.add("Ali");

        // Create a Vector from that List
        Vector<String> names = new Vector<>(list);

        // Add elements
        names.add("Sarmad");              // Add at end
        names.addElement("Areeba");       // Legacy add
        names.add(2, "Beenish");          // Insert at index
        System.out.println("Initial Vector: " + names);

        // Access elements
        System.out.println("First element: " + names.firstElement());
        System.out.println("Last element: " + names.lastElement());
        System.out.println("Element at index 2: " + names.get(2));

        // Modify element
        names.set(1, "Usman");   // Replace Ali with Usman
        System.out.println("After set: " + names);

        // Remove elements
        names.remove("Sarmad");          // Remove by value
        names.remove(0);                 // Remove by index
        names.removeElement("Usman");    // Legacy remove
        System.out.println("After removals: " + names);

        // Search
        System.out.println("Contains Areeba? " + names.contains("Areeba"));
        System.out.println("Index of Beenish: " + names.indexOf("Beenish"));
        System.out.println("Last index of Ahmad: " + names.lastIndexOf("Ahmad"));

        // Capacity & size
        System.out.println("Size: " + names.size());
        System.out.println("Capacity: " + names.capacity()); // Vector has capacity property unlike ArrayList

        // Iterating
        System.out.print("Using for-each: ");
        for (String n : names) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.print("Using index loop: ");
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }
        System.out.println();

        // Legacy Enumeration
        System.out.print("Using Enumeration: ");
        Enumeration<String> e = names.elements();
        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }
        System.out.println();

        // Clear all
        names.clear();
        System.out.println("After clear: " + names);
        System.out.println("Is empty? " + names.isEmpty());




    }
}
