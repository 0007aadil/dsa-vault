class Solution {
    public int maxDistance(int[] arr, int m) {




        Arrays.sort(arr);
        

        
        int low = 1 ;
        int high = arr[arr.length -1] - arr[0];

        int ans = -1 ;

        while ( low <= high ){
            int mid = low + ( high - low )/ 2 ;

            

           if ( possible(arr, mid, m ) ){
            ans = mid ;
            low = mid + 1 ;


           }else {
            high = mid -1 ;
           }

        }

        return ans ;


        
    }

    boolean possible (int[] arr, int mid , int m  ){
        int prev = 0 ;
        int curr = 0 ; 
        
        int count = 1;
        int n = arr.length -1 ;

       while ( prev <= n && curr <= n){
            int val = arr[curr] -  arr[prev];

            if ( val >= mid ){
                count++;
                prev = curr;
                curr++;
            }else {
                curr++;
            }

            if ( count == m ){
                return true ;
            }
        }

        return false ;


       
    }


}