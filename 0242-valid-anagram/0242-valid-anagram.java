class Solution {
    public boolean isAnagram(String s, String t) {

        if ( s.length() != t.length()){
            return false ;
        }


        char[] a = s.toCharArray();

        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        String l = new String(a);
          String m = new String(b);


          for ( int i =0 ; i < l.length() ; i++){

            char c = l.charAt(i);
            char d = m.charAt(i);
            if ( c != d  ){
                return false ;
            }
          }



          return true ;

        
    }
}