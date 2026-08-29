class Solution {
    public List<List<String>> solveNQueens(int n) {

        List<List<String >> arr = new ArrayList<>();

        int[] chess = new int[n];

        backtrack(0 , n , chess , arr);
        return arr ;
        
    }

    public static void backtrack(int j , int n  ,int[] chess , List<List<String >> arr  ){

        if ( j == n ){
            arr.add(build(chess , n));
            return ; 
        }

        
        for ( int i = 0; i < n ; i++){
            if(safe( i , j ,  chess )) {

                chess[j] = i ; 

            backtrack( j + 1 , n , chess , arr );

            }
            
            
        }
    }

    public static boolean safe(int i ,int j ,  int[] chess){

        for ( int k = 0 ; k < j ; k++){
            if(chess[k] == i) return false ;
            if(k - chess[k] == j - i) return false ;
            if(k + chess[k] == j + i) return false ;
        }


        return true ;

    }

    public static List<String>  build ( int[] chess , int n){
         List<String> lst = new ArrayList<>();
         for ( int k = 0 ; k < n ; k++){
           String s = "";
           for ( int l = 0 ; l < n ; l++){
                if ( chess[k] == l ){
                    s = s + 'Q';
                }else {
                    s = s+ '.';
                }
            
           }
           
           lst.add(s);
         }

         return lst ; 
    }
}