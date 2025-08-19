package Day3;

public class Topic_2_2D_Array {
    public static void main(String[] args) {

        int[][] numbers = new int[2][3]; // [rows][cols]

        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[1][0] = 4;
        numbers[1][1] = 5;
        numbers[1][2] = 6;

        //   R  =  cols   = values
        //  [0] = [0,1] = [1,2]
        //  [1] = [0,1,2] = [4,5,6]

        System.out.println(numbers[0][2]);
        System.out.println(numbers[1][1]);
        System.out.println(numbers[0][1]);


    }
}
