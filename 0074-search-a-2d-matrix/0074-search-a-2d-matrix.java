class Solution {


    boolean searchRow(int[][] matrix, int target , int row  ){

        int start = 0 ;
        int end = matrix[row].length - 1 ;

        while ( start <= end ){
            int mid = start + ( end - start )/ 2 ;

            if ( matrix[row][mid] == target  ){
                return true ;
            }if ( matrix[row][mid] > target ){
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }

        return false ;

    }


    public boolean searchMatrix(int[][] matrix, int target) {


        int start = 0 ;
        int n = matrix.length;
        int end = n-1 ;


        while ( start <= end ){

            int mid = start + ( end - start )/2;

            if ( matrix[mid][0] == target ||  matrix[mid][matrix[0].length -1 ] == target ){
                return true ;
            }else if ( matrix[mid][0] > target ){
                end = mid - 1 ;
            }else if (matrix[mid][matrix[0].length -1 ] < target ) {

                start = mid + 1;

            } else {

                return searchRow(matrix, target , mid );



            }



        }


        return false ;
        
    }
}