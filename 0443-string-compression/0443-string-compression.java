class Solution {
    public int compress(char[] chars) {

        int idx = 0 ; 

        for ( int i = 0 ; i < chars.length ; i++){
            char c = chars[i];
            int count = 0 ; 
            int k = i;

            int j = i ; 

            while (j < chars.length && chars[j] == c ){
                count++;
                j++;
                
            }

            chars[idx] = c;
            idx++;
            if ( count > 1 ){
                String s = String.valueOf(count);

                for ( int t = 0 ; t < s.length() ; t++){
                    chars[idx] = s.charAt(t);
                    idx++;

                }
            }

            

            i = j - 1;




        }

        

        return idx ; 
        
    }
}