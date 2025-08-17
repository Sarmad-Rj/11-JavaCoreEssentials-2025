package Day2;

public class Type_conv {
    public static void main(String[] args) {
        byte a = 5;
        int b = a;

        double c = 12.5d;
        int d = (byte) c;

        float x = 10.9f;
        byte y = (byte) x;
        System.out.println(y);
    }
}
