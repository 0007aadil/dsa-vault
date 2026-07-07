class Solution {
    public long sumAndMultiply(int n) {

       String s = Integer.toString(n);
       int sum =0  ;
       int newNum =0 ;

       for ( int i =0 ; i < s.length() ; i++){

        char c = s.charAt(i); 
         int num = c - '0';

        if ( num != 0){

            

            sum = sum + num;
            newNum = (newNum * 10) + num  ;


        }
       }

       long res =(long) sum * newNum;

       return res ;
        
    }
}