class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {


        int row = matrix.length;
        int col = matrix[0].length;




         for ( int i = 0 ; i < row; i++ ){

            for ( int j = col ; j > 0 ; j--){

                if ( matrix[i][0] == target){
                    return true;
                }

                if ( j > 0 &&  matrix[i][j - 1] == target ){
                    return true;
                }else if ( j > 0 && target  > matrix[i][j -1] ) {
                    j = 0;
                    
                }


            }
         }

         return false ;

        
    }
}