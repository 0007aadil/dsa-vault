class Solution {
    public List<List<Integer>> combine(int n, int k) {

       
         

        List<List<Integer>> arr = new ArrayList<>();
        backtrack ( 1  , new ArrayList<>() , arr , n , k  );
        return arr ;


        
    }


    void backtrack( int start , List<Integer> lst ,  List<List<Integer>> arr , int n , int k    ){
        if ( lst.size() == k){
           arr.add(new ArrayList<>(lst));
            return ;
        }

        
        for ( int i = start ; i <= n ; i++){
            lst.add(i);

            backtrack ( i + 1, lst  , arr , n , k );
            lst.remove(lst.size() -1 );

            
        }
    }
}