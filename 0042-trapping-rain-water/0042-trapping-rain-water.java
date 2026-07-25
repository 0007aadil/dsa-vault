class Solution {
    public int trap(int[] height) {

         


        

        int[] arr = new int[height.length];
        arr[0] = 0 ;
        

        int[] left =new  int[height.length  ];
        int[] right =new  int[height.length  ];

        left[0] = 0;
        right[0] = 0 ;



        int leftMax = -1;
        int rightMax = -1;



        for ( int i = 0 ; i <  height.length ; i++ ){
                if ( height[i] > leftMax){
                    leftMax =   height[i];
                }
                left[i] = leftMax;



        }


        for ( int i = height.length -1; i >= 0; i--){
                if ( height[i] > rightMax){
                    rightMax =   height[i];
                }

                right[i] = rightMax; 
        }


        int sum  = 0 ;

        for ( int i = 0 ; i < height.length ; i++ ){

            int minVal =  Math.min(left[i],right[i]);

            arr[i] = minVal - height[i];

            sum = sum + arr[i];

        }

        return sum ; 
  



        
    }
}