class Solution {
    public boolean isPalindrome(String s) {


        s = s.replaceAll("[^a-zA-Z0-9]" , "");

        String  ss = s.toLowerCase();

        int start = 0 ;
        int end = ss.length() -1 ;


        while (start <= end ){

            char c = ss.charAt(start);
            char b = ss.charAt(end);

            if ( c == b ){
                start++;
                end--;
            }else {
                return false ;
            }
        }


        return true ;


        
    }
}