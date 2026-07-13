class Solution {


    public void setZeroes(int[][] matrix) {




        ArrayList<int[]> arr = new ArrayList<>();


        for( int i =0 ; i < matrix.length; i++){

            for( int j = 0 ; j<matrix[0].length; j++ ){

            
            if ( matrix[i][j] == 0 ){
                int[] n = {i , j};
                arr.add(n);
            }

            }
        }


        for ( int i = 0 ; i < arr.size(); i++){

            int row = arr.get(i)[0];
            int col = arr.get(i)[1];

            for ( int j = 0 ; j <matrix[0].length; j++ ){
                matrix[row][j] = 0;
                
            }



            for ( int j = 0 ; j <matrix.length; j++ ){
                
                matrix[j][col] = 0 ;
            }
        }


        


       










        
    }
}