class Solution {
    public int[] sortArray(int[] nums) {


        backtrack( 0 , nums.length-1 , nums);
        return nums;


        
    }


    void backtrack(int low , int high , int[] nums ){


        if ( low < high){

            int mid = low + ( high -low )/2;

            backtrack(low , mid  , nums);
            backtrack(mid+1 , high , nums);

            mergeSort(low , mid , high , nums );


        }
        

        
    }

    void mergeSort ( int low , int mid , int high , int[] nums){

        int[] temp = new int[high -low +1 ];
        
        int pFirst = low ;
        int pSecond = mid+1;
        int count = 0 ;

        while  ( pFirst <= mid && pSecond <= high ){
            if( nums[pFirst] > nums[pSecond]){
                temp[count] = nums[pSecond];
                pSecond++;
                count++;
            }else {
                temp[count] = nums[pFirst];
                pFirst++;
                count++;
            }
        }

        while ( pFirst <= mid){
            temp[count] = nums[pFirst];
                pFirst++;
                count++;

        }

        while (pSecond <= high){
            temp[count] = nums[pSecond];
                pSecond++;
                count++;

        }

        for ( int i =0 ; i < temp.length ; i++){
            nums[low] = temp[i];
            low++;
        }
        
    }
}