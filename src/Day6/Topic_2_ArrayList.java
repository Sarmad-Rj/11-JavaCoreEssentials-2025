package Day6;

import java.util.ArrayList;

public class Topic_2_ArrayList {
    public static void main(String[] args) {

        // stores obj

//        ArrayList<String> A1 = new ArrayList<>();
////        int
//        ArrayList<Integer> A2 = new ArrayList<>();
////        char
//        ArrayList<Character> A3 = new ArrayList<>();
////        float
//        ArrayList<Float> A4 = new ArrayList<>();
////        boolean
//        ArrayList<Boolean> A5 = new ArrayList<>();
////
////        A1[0] = "SARMAD";
//        A1.add("SARMAD");
//        A1.add("AHMAD");
//        A1.add("SIBTAIN");
//
////        System.out.println(A1[0]);
//        System.out.println(A1.get(0));
//
//        A1.remove("SARMAD");
//        A1.remove(0);
//
//        System.out.println(A1.isEmpty());

//        () = parentheses
//        {} = Curly braces
//        [] = Brackets
//        <> = Diamond Operator


        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        ArrayList<Integer> a2 = (ArrayList<Integer>) a1.clone(); // shallow

        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(1);
        a3.add(2);
        a3.add(3);
        ArrayList<Integer> a4 = new ArrayList<>(); // DEEP COPY
        for (int an : a3) {
            a4.add(an);
        }


        System.out.println("A1 ArrayList: " + a1);
        a1.set(0, 12);
        System.out.println("A1 ArrayList after update: " + a1);
        System.out.println("A2 shallow copy of A1: " + a2);


        System.out.println("\nA3 ArrayList: " + a3);
        a3.set(0, 12);
        System.out.println("A3 ArrayList after update: " + a3);

        System.out.println("A4 shallow copy of A3: " + a4);


    }
}
