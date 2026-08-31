class Solution {
    public void solveSudoku(char[][] board) {


        char[] charArr = {'1','2','3','4','5','6','7','8','9'};
        backtrack(charArr , board);
        
    }

    public boolean backtrack(char[] charArr , char[][] board ){


        for ( int row = 0 ; row < 9 ; row++){
            for ( int col = 0 ; col < 9 ; col++){

                if (board[row][col] != '.') continue ;

                for ( int k = 0 ; k < charArr.length; k++){
                    char ch = charArr[k];

                    if(!isSafe(board , row , col , ch )) continue ;

                    board[row][col] = ch;
                    if(backtrack(charArr, board)) return true  ;
                    board[row][col] = '.';


                    
                }

                return false ;

                
            }
        }
        return true;

    }

    public boolean isSafe(char[][] board , int row , int col , char ch ){
        int gridRow = (row / 3) *3 ;
        int gridCol = (col/3) * 3 ;

        for ( int i =0 ; i < 9 ; i++ ){
            if (board[row][i] == ch) return false ;
            if(board[i][col] == ch) return false ;

        } 

        for ( int i = gridRow; i < gridRow+3 ; i++){
            for ( int j = gridCol ; j < gridCol+3; j++){
                if(board[i][j] == ch)return false ;
            }
        }

        return true ;
    }




}