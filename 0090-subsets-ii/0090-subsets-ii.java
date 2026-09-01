class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {


        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums); 
        backtrack(0, new ArrayList<>(),arr , nums );
        return arr ; 


        
    }


    public void backtrack ( int start,  List<Integer> lst , List<List< Integer>> arr ,int[] nums ){
        

       

        arr.add(new ArrayList<>(lst));



        for ( int i = start ; i< nums.length ; i++){
            if (i > start && nums[i] == nums[i-1]) continue;
            lst.add(nums[i]);
            backtrack(i + 1 , lst , arr , nums);
            lst.remove(lst.size() -1 );

        }

       

        

        

       

       

        




    }

    boolean isPresent(List<Integer> lst , List<List<Integer>> arr ){
       return arr.contains(lst);
    }
}