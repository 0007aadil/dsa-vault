class Solution {
    public void sortColors(int[] nums) {


        int prev ;
        int curr ;

        for ( int i = 0 ; i < nums.length ; i++){

            for ( int j = 0 ; j < nums.length - 1 ; j++){

                prev = nums[j];
                curr = nums[j+1];

                int min = Math.min( prev , curr);
                nums[j] = min;
                int max = Math.max (prev, curr);
                nums[j+1] = max;
            }
        }
        
    }
}