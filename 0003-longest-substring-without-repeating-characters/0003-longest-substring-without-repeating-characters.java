class Solution {
    public int lengthOfLongestSubstring(String s) {

        String str ;

        int count;
        int res = 0;

        for ( int i =0 ; i < s.length(); i++){

            count = 0;
            str = "";

            for ( int j = i ; j< s.length(); j++){


             char c = s.charAt(j);

             String ss = "" + c;
 
         
             boolean b = str.contains(ss); 

             if ( b == false ){
                count++;
                str = str + c;
             } else {
                break;
             }






            }

            if ( count > res ){
                res = count ;
            }


            


            

            


            
        }


        return res;
        
    }
}