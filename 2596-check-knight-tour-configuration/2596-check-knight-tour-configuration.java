class Solution {
    public boolean checkValidGrid(int[][] grid) {

        return backtrack(0 , 0 , 0 , grid );
        
    }


    public boolean backtrack( int count , int row , int col , int[][]grid){
        if ( count == grid[0].length * grid[0].length){
            return true ;
        }

        int[] pos = findPos(count , grid);

        int currRow = pos[0];
        int currCol = pos[1];

        if ( count == 0 ){
            if ( currRow != 0 || currCol != 0){
                return false ;
            }
        }else {
            if(!isPossible(row , col , currRow, currCol )) return false ;
        }

        return backtrack( count +1 , currRow , currCol , grid ); 
    }


    public int[] findPos(int val , int[][] grid){
        for ( int i =0 ; i < grid.length ; i++){
            for ( int j = 0 ; j < grid.length ; j++){
                if (grid[i][j] == val) {
                    return new int[]{i , j};
                }
            }
        }

        return null ;
    }

    public boolean isPossible(int row , int col , int currRow , int currCol ){
        int r = Math.abs(row - currRow);
        int c = Math.abs(col - currCol);

        return (r == 1 && c == 2 || r == 2 && c == 1 );
    }
}