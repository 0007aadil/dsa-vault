class Solution {
    public int findDuplicate(int[] nums) {

         HashSet<Integer> arr = new HashSet<>();

        arr.add(nums[0]);


        for ( int i = 1 ; i < nums.length ; i++){
            if ( arr.contains(nums[i])){
                return nums[i];
            }else {
                arr.add(nums[i]);
            }
        }

        return -1  ;
        
    }
}