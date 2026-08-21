class Solution {
    public String reverseWords(String s) {

        List <String > l= new ArrayList<>();

        if (s.charAt(0) == ' '){
            s = s.substring(1 );
        }
        if (s.charAt(s.length() -1 ) != ' '){
            s = s + ' ';
        }

        int start = 0 ;
        int curr = 0; 

        while (curr < s.length()){

            char c = s.charAt(curr);
            


            if ( c != ' ' ){
                curr++;
            }else if ( start == curr  ){
                start++;
                curr++;
               

            }else {
                String str = s.substring(start , curr );
                l.add(str);
                start = curr + 1;
                curr++;
            }

        }

        String res= "";

        for ( int i = l.size() -1 ; i >= 0 ; i--){

            res = res + l.get(i) + ' ';

        }

        if (res.length() > 0) {
            res = res.substring(0, res.length() - 1);
        }


        return res ;
        
    }
}