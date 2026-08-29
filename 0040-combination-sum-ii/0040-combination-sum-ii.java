class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int k) {
          
            Arrays.sort(nums);


        List < List < Integer > > arr = new ArrayList<>();

        backtrack(nums , 0 , k , new ArrayList<>() , arr);
        

        return arr ;

        
    }

    public static void backtrack(int[] nums , int start , int remaining , ArrayList<Integer> lst ,List<List<Integer>>  arr  ){

        

      


        if ( remaining == 0 ){
            arr.add(new ArrayList<>(lst) );
            return ;
        }

        if ( remaining < 0 ){
            return ; 
        }

        for ( int i = start ; i < nums.length ; i++){

            if ( i > start && nums[i] == nums[i-1]){
                continue ;
            }

            

            lst.add(nums[i]);

            backtrack(nums , i + 1 , remaining - nums[i] , lst , arr);

            lst.remove(lst.size() - 1);
        }







    }



}