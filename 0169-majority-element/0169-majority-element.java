class Solution {
    public int majorityElement(int[] nums) {
        int count = 0 , number =-1  ;

        for ( int i =0 ; i < nums.length ; i++){
            if ( count == 0 ){
                number = nums[i];
                count = 1 ;
            } else {
                if ( nums[i] == number  ){
                    count++;

                }else {
                    count--;
                }
            }
        }


        count = 0 ; 

        for ( int i =0 ; i < nums.length; i++){
            if ( nums[i] == number ){
                count++;
            }
        }


        if ( count > (nums.length / 2 )){
            return number ;
        }

        return -1 ;
        
    }
}