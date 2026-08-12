class Solution {
    public int compress(char[] chars) {


        String a = "" + chars[0];
        int count = 1 ;
        int j = 0 ;

        for ( int i = 1 ; i < chars.length ; i++){

            char c1 = chars[j];
            char c2 = chars[i];
            

            if ( c1 != c2 && count < 2 ){
                a = a + c2 ;
                j = i ;
                count = 1 ;
            }else if (c1 != c2 && count > 1   ){
                a = a  + count + c2 ; 
                j = i ;
                count = 1 ;
            }else {
                count++;
            }


        }


         if (count > 1) {
            a = a + count;
        }



        count = 0 ;
        for ( int i = 0 ; i < a.length() ; i++){
            count++;
            char c = a.charAt(i);
            chars[i] = c;

        }

        return count ;

    }
        
    
}