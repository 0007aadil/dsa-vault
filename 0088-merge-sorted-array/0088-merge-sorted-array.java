class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] newArr = new int[m+n];
        int count = 0;

        for ( int i = 0 ; i < m ; i++){

            newArr[count] = nums1[i];
            count++;

        }

        count = m ;

        for ( int i = 0 ; i <  n ; i++){

            newArr[count] = nums2[i];
            count++;

        }


        Arrays.sort(newArr);

       for( int i =0 ; i< newArr.length ; i++){
        nums1[i] = newArr[i];
       }


    }
}