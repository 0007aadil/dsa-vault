class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        

        int start = 0 ;
        int end = arr.length -1 ;
        int mid = start + (end - start )/ 2 ;

        
        for ( int i = 0 ; i < arr.length ; i++){

             mid = start + (end - start )/ 2 ;

            if ( arr[mid + 1 ] > arr[mid]){
                start = mid ;
            }else if (arr[mid - 1] > arr[mid]){
                end = mid ; 
            }else {
                return mid;
            }

            
        }

        return mid ;
    }
}