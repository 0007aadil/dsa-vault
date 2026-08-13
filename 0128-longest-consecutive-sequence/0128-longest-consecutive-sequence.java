class Solution {
    public int longestConsecutive(int[] nums) {

        if ( nums.length == 0 ){
            return 0 ; 
        }

        Arrays.sort(nums);

        
        int count = 1 ;
        int tempCount = 1 ;

       for ( int i = 1 ; i < nums.length ; i++){
        int val1 = nums[i-1];
        int val2 = nums[i];

        int diff = val2 - val1 ;

        if ( diff == 1 ){

            tempCount++;

        }else if (diff == 0 ){
            tempCount = tempCount; 
        }else if ( diff > 1 ){
            tempCount = 1 ;
            
        }

        if ( tempCount > count ){
            count = tempCount ;
        }


        
       }

       return count ;




        
        
    }
}