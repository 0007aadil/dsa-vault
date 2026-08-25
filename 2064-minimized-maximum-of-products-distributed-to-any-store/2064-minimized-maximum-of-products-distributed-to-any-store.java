class Solution {
    public int minimizedMaximum(int n, int[] arr) {

     



        int low = 1;

        int[] fakeArr = new int[arr.length];

        for ( int i = 0 ; i < arr.length ; i++){
            fakeArr[i] = arr[i];
        }

        Arrays.sort(fakeArr);

        int high = fakeArr[fakeArr.length -1 ];

        int ans = -1 ;

        while ( low <= high ){
            int mid = low + ( high - low ) / 2;

            if ( possible( n , arr , mid)){
                ans  = mid;
                high = mid - 1;

            }else {
                low = mid +1 ;
            }


        }


        return ans;      
    }

    boolean possible ( int n, int[] arr , int mid){


        

       int count = 0 ;
        for ( int i = 0 ; i < arr.length ; i++){
            if ( arr[i] % mid == 0){
                count = count + arr[i] / mid;
            }else {
                count = count + ( arr[i] / mid + 1 ) ;
            }
            

        }

        

       

        return count <= n  ;
    }






}