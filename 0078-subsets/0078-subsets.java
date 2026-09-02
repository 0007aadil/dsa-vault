class Solution {
    public List<List<Integer>> subsets(int[] nums) {

            List<List<Integer>> arr = new ArrayList<>();

            backtrack ( 0 , new ArrayList<>(), arr , nums  );

            return arr ;

        
    }

    void backtrack ( int start , List<Integer> lst , List<List<Integer>> arr , int[] nums  ){
       

        if ( start == nums.length  ){
             arr.add( new ArrayList<>(lst));
             return;
        }  


       lst.add(nums[start]);
       backtrack(start + 1 , lst , arr , nums );
       lst.remove(lst.size() -1 );
       backtrack(start + 1 , lst , arr , nums );
    }
}