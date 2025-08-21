package Day5;

public class Class_Task_2 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        String str1 = "";
        for (int i = 1; i <= 100000; i++) {
            str1 += "Hi";
        }
        long end = System.currentTimeMillis();
        System.out.println("String concatenation time: " + (end - start) + " ms");

        long start1 = System.currentTimeMillis();
        StringBuilder str2 = new StringBuilder("");
        for (int i = 1; i <= 100000; i++) {
            str2.append("Hi");
        }
        long end1 = System.currentTimeMillis();
        System.out.println("StringBuilder append time: " + (end1 - start1) + " ms");

        long start2 = System.currentTimeMillis();
        StringBuffer str3 = new StringBuffer("");
        for (int i = 1; i <= 100000; i++) {
            str3.append("Hi");
        }
        long end2 = System.currentTimeMillis();
        System.out.println("StringBuffer append time: " + (end2 - start2) + " ms");

    }
}