


class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int k) {


        List<List<Integer>> arr = new ArrayList<>();

        backtrack( nums , k , 0 ,new ArrayList<>(),  arr );

        return arr ; 



        
    }


    public static void backtrack( int[] nums , int remaining , int start  , List<Integer > path , List<List<Integer>> arr ) {

        if ( remaining == 0  ){
            arr.add(new ArrayList<>(path));
            return; 

        }

        if ( remaining < 0 ){
            return;  
        }

        for ( int i = start ; i < nums.length ; i++){
            path.add(nums[i]);

            backtrack(nums,   remaining - nums[i], i , path , arr);

            path.remove(path.size() -1 );
        }



    }
}