package Day17;

public class SearchInMatrix {
    //    Search a 2D Matrix
//    Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
//
//    Integers in each row are sorted from left to right.
//    The first integer of each row is greater than the last integer of the previous row.
//    Example 1:
//
//    Input:
//    matrix = [
//            [1,   3,  5,  7],
//            [10, 11, 16, 20],
//            [23, 30, 34, 50]
//            ]
//    target = 3
//    Output: true
//    Example 2:
//
//    Input:
//    matrix = [
//            [1,   3,  5,  7],
//            [10, 11, 16, 20],
//            [23, 30, 34, 50]
//            ]
//    target = 13
//    Output: false
    public static void main(String[] args) {
        var matrix = new int[][]{
                new int[]{1, 3, 5, 7},
                new int[]{10, 11, 16, 20},
                new int[]{23, 30, 34, 50},
        };
        searchMatrix(matrix, 5);
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            //[0][3]
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }

        return false;
    }

    public boolean SearchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[1].length;
        int start = 0;
        int end = rows * cols - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int row = mid / cols;
            int col = mid % cols;
            int val = matrix[row][col];
            if (val == target)
                return true;
            if (val > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return false;
    }
}
