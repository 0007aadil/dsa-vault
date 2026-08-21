class Solution {
    public String longestPrefix(String s) {

        int n = s.length()  ;

        int[] arr = new int[n];

        arr[0] = 0 ;

        for ( int i = 1 ; i < s.length() ; i++){
            int len = arr[i-1];

            while ( len > 0 && s.charAt(i) != s.charAt(len)){
                len = arr[len -1 ];
            }

            if ( s.charAt(i) == s.charAt(len)){
                len++;
            }

            arr[i] = len;
        }

        String res = s.substring(0,arr[n-1]);
        return res;
        
    }
}