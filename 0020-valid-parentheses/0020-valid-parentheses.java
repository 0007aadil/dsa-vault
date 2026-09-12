class Solution {
    public boolean isValid(String s) {


        Deque<Character > q = new ArrayDeque<>();

        


        HashMap<Character , Character> map = new HashMap<>();

        map.put('(', ')');
        map.put('{','}');
        map.put('[',']');


        for ( int i = 0 ; i < s.length() ; i++){

            char c = s.charAt(i);

            if ( map.containsKey(c)){
                q.push(c);
            }else{
                if(q.isEmpty()) return false  ;

                char k = q.pop();

                char m = map.get(k);

                if ( m != c ){
                    return false ;
                }
            }
        }

        if ( q.isEmpty()){
            return true ;
        }


        return false ;

        
    }
}