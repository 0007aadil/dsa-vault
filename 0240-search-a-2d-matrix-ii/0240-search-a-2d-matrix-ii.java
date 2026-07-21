class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {

        int start = 0;
        int bottomEnd = matrix.length - 1;
        int topEnd = matrix[0].length - 1;

        while (start <= bottomEnd && topEnd >= 0) {

            int val = matrix[start][topEnd];

            if (val == target) {
                return true;
            } else if (val > target) {
                topEnd--;
            } else {
                start++;          
            }

        }

        return false;
    }
}