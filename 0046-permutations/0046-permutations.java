class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> arr = new ArrayList<>();

        boolean[] used = new boolean[nums.length];

        backtrack(used , new ArrayList<>() , arr  , nums);
        return arr ;
        
    }


    void backtrack ( boolean[] used , List<Integer> lst ,List<List<Integer>> arr, int[] nums ){

        if ( allTrue(used) ){
            arr.add( new ArrayList<>(lst));
            return ; 
        }

        
        for( int i= 0 ; i < nums.length ; i++){
            if ( used[i]) continue ;
            

            lst.add(nums[i]);
            used[i] = true ;

            backtrack(used , lst , arr , nums);
            lst.remove(lst.size() -1 );
            used[i]  = false ;
        }
    }

    boolean allTrue(boolean[] used){
        for ( int i = 0 ; i < used.length ; i++){
            if ( used[i] == false){
                return false ;
            }
        }

        return true ;
    }
}