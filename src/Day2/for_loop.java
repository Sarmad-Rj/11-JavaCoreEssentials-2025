package Day2;

public class for_loop {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        for(int i = 1; i <= 10; i++){ // rows
            for(int j = 1; j <= 10; j++){ // col
                System.out.print("* ");
            }
            System.out.println();
        }

        int i = 20;
        do{
            System.out.print("@");
            i++;
        } while (i <= 10);

        int j = 20;
        while (j <= 10){
            System.out.print("#");
            i++;
        }

        for (int k = 1; k <= 10; k++) {
            if (k % 2 == 1) {
                continue;
            }
            System.out.println("Odd: " + k);
        }
    }
}
