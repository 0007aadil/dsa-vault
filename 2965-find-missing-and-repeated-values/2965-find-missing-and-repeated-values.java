class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;





        int[] newArr = new int[rows * cols];
        int count = 0;

        for ( int i =0; i < rows; i++){
            for( int j =0 ; j< cols; j++){

                newArr[count] = grid[i][j];
                count++;

            }
        }

        Arrays.sort(newArr);

       
        int number = 0;
        int missing = 0;
        int n2 = rows * cols;

        if (newArr[0] != 1) {
            missing = 1;
        }

        for( int i =1; i< newArr.length; i++){

            if(newArr[i] == newArr[i-1] ){
                number = newArr[i];

            }else if(newArr[i] - newArr[i-1] == 2){
                missing = newArr[i-1] + 1;
            }

        }

        if (newArr[newArr.length - 1] != n2) {
            missing = n2;
        }



       

        int[] res = {number, missing};

        return res;




    }
}