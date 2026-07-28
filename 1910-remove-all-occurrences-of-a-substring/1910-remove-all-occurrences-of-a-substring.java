class Solution {
    public String removeOccurrences(String s, String part) {


        int n = part.length() ;

        for ( int i = 0 ; i <= s.length() - n ; i++){

            if ( chekSubString(s, part , i ) == true ){

                StringBuilder sb = new StringBuilder(s);
                sb.delete(i , i+n);
               s= sb.toString();
                
              
                i = -1 ; 
            }




        }

        return s ; 

        
    }




    static boolean chekSubString( String s , String sub , int k  ){


        for ( int i = 0 ; i < sub.length(); i++){

            char c = s.charAt(i + k );
            char d = sub.charAt(i);

            if ( c != d ){
                return false ;
            }

        }

        return true ;
    }
}