package Day3;

public class Class_Task_3 {
    public static void main(String[] args) {
        // Q: Implement matrix addition for two 2x2 matrices using 2D arrays.

        // int[][] a = new int[2][2];
        // int[][] b = new int[2][2];
        // int[] x = {1,3,4};

        int[][] a = {
                {1, 2},
                {3, 4}
        };

        int[][] b = {
                {5, 6},
                {7, 8}
        };

        int[][] x = new int[2][2];

        //  int[][] x = {
        //          {6, 8},
        //          {10, 12}
        //  };

        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < 2; c++) {
                x[r][c] = a[r][c] + b[r][c];
            }
        }

        System.out.print("The values of 2D array x are: ");
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < b.length; c++) {
                System.out.print(x[r][c] + " ");
            }
        }
    }
}
