public class test {
    public static void main(String[] args) {
        // 3 rows, 2 columns (all elements initialized to 0)
        int[][] matrix = new int[3][2];

        // Initialize with values
        int[][] grid = {
                {1, 2, 3},   // Row 0
                {4, 5, 6},   // Row 1
                {7, 8, 9},
                {3, 3, 3}      // Row 3
        };


        int[][] jagged = new int[3][];

        // Create sub-arrays of different lengths
        jagged[0] = new int[2];  // 2 elements
        jagged[1] = new int[4];  // 4 elements
        jagged[2] = new int[3];  // 3 elements

        // Assign values
        jagged[0][0] = 1; jagged[0][1] = 2;
        jagged[1][0] = 3; jagged[1][1] = 4; jagged[1][2] = 5; jagged[1][3] = 6;
        jagged[2][0] = 7; jagged[2][1] = 8; jagged[2][2] = 9;

        // Print
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

    }
}


//#include <iostream>
//using namespace std;
//
//int main() {
//    int rows = 3;
//
//    // Create array of pointers
//    int* jagged[3];
//
//    // Define different column sizes
//    jagged[0] = new int[2];  // 2 elements
//    jagged[1] = new int[4];  // 4 elements
//    jagged[2] = new int[3];  // 3 elements
//
//    // Example: assign values
//    jagged[0][0] = 1; jagged[0][1] = 2;
//    jagged[1][0] = 3; jagged[1][1] = 4; jagged[1][2] = 5; jagged[1][3] = 6;
//    jagged[2][0] = 7; jagged[2][1] = 8; jagged[2][2] = 9;
//
//    // Print
//    for(int i = 0; i < rows; i++) {
//        for(int j = 0; j < (i+2); j++) {
//            cout << jagged[i][j] << " ";
//        }
//        cout << endl;
//    }
//
//    // Free memory
//    for(int i = 0; i < rows; i++) {
//        delete[] jagged[i];
//    }
//
//    return 0;
//}










//Use four arrays (numbers, squares, cubes, sums) of 5 elements:
//o	numbers[i] = i
//o	squares[i] = i²
//o	cubes[i] = i³
//o	sums[i] = numbers[i] + squares[i] + cubes[i]
//Display all arrays and the total of all values in sums.
