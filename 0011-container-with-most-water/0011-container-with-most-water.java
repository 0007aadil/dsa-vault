class Solution {
    public int maxArea(int[] height) {

        if ( height.length <= 1){
            return 0;
        }

        int max = Integer.MIN_VALUE ;
        int l , b ;

       int left = 0; 
       int right = height.length - 1; 

       while ( left < right  ) {
        l = right - left ;
        b = Math.min( height[left] , height[right]);
        int area = l * b ;

        if ( area > max ){
            max = area ;
        }

        if ( height[left] > height[right] ){
            right--;

        }else {
            left++;
        }


       }




        return max ; 
        
    }
}