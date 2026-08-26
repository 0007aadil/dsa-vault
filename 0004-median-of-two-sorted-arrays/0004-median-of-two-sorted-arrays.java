class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if ( nums1.length > nums2.length ){
            return findMedianSortedArrays(nums2, nums1 );
        }


        int m = nums1.length ;
        int n = nums2.length ; 

        int half = (m + n + 1) / 2 ;

        int low = 0 ; 
        int high = m;

        while ( low <= high ){
            int i = low + ( high - low )/2;
            int j = half - i ;

            int left1 ;
            if ( i == 0 ){
                left1 = Integer.MIN_VALUE;
            }else {
                left1 = nums1[i-1];
            }

             int left2 ;
            if ( j == 0 ){
                left2 = Integer.MIN_VALUE;
            }else {
                left2 = nums2[j-1];
            }

             int right1 ;
            if ( i == m ){
                right1 = Integer.MAX_VALUE;
            }else {
                right1 = nums1[i];
            }

             int right2 ;
            if ( j == n ){
                right2 = Integer.MAX_VALUE;
            }else {
                right2 = nums2[j];
            }


            if ( left1 <= right2 && left2 <= right1 ){
                if ( (m + n) % 2 == 1  ){
                    return Math.max(left1 , left2 );
                }else {
                return ((Math.max(left1 , left2) + Math.min(right1 , right2)) / 2.0 );}
            }else if ( left1 > right2 ) {
                high = i - 1 ;

            }else {
                low = i + 1 ;
            }
        }


        return 0.0;
    }
}