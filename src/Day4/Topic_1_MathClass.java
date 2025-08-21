package Day4;

public class Topic_1_MathClass {
    public static void main(String[] args) {

        int min = Math.min(45678, 9876);
        float minf = (float) Math.min(12.23, 234.543);
        System.out.println("Min is int: " + min + "\nMin in float: " + minf);

        int max = Math.max(45678, 9876);
        System.out.println("Max: " +  max);

        System.out.println("Random No: " + (int) (Math.random() * 100));

    }
}
