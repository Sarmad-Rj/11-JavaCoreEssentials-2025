package Day3;

public class Topic_2_Jagged_Array {
    public static void main(String[] args) {
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

// C++ code
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
