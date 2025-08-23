package Day4;

public class Class_Task_1 {

    public static int sum (int a, int b) {
        int sum = a+b;
        return sum;
    }

    public static int sum (int a, int b, int c) {
        int sum = a+b+c;
        return sum;
    }

    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 55;
        int num3 = 345;

        int sum1 = sum(num1, num2);
        int sum2 = sum(num1, num2, num3);

        System.out.println(sum1); // 100
        System.out.println(sum2); // 445
    }
}
