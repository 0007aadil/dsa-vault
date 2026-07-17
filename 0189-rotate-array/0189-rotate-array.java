class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;

         k = k % n; 

        


        int[] arr1 = new int[n -k];

        for ( int i = 0 ; i < n - k ; i++){
            arr1[i]  = nums[i];
        }


        int[] arr2 = new int[k];

        for ( int i = 0   ; i < k; i++){

            arr2[i] = nums[n - k + i];

        }


        for ( int i =0 ; i <n ; i++){
            if ( i <  k ){
                nums[i] = arr2[i];
            } else {
                nums[i] = arr1[i - k];
            }
        }
        
    }
}