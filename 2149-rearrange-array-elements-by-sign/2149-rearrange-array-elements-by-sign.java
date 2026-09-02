class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
           List<Integer> arr2 = new ArrayList<>();


           for ( int i = 0 ; i < nums.length ; i++){
            if ( nums[i] >= 0){
                arr1.add(nums[i]);
            }else {
                arr2.add(nums[i]);
            }
           }

            int c1 = 0 , c2 = 0, k =0  ;
            

            while ( c1 != arr1.size()  && c2 != arr2.size() ){

                nums[k] = arr1.get(c1); 
                c1++;
                k++;
                nums[k] = arr2.get(c2);
                c2++;
                k++;

            }

           

           return nums;
        
    }
}