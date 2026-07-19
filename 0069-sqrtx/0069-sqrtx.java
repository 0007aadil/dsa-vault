class Solution {
    public int mySqrt(int x) {

        if ( x == 0 ) return 0;

        int start = 1 ;
        int end = x ;
        int res = 1;

        while ( start <= end ){

            int  mid = start + ( end - start )/2 ;

            long sqt = (long) mid * mid ;

            if ( sqt == (long)x ){
                
                return  mid ;
            }else if ( sqt > x ){
                

                end = mid -1 ;

            }else {
                res = mid;
                
                start = mid + 1 ;
            }
        }

        return res ;
        
    }
}