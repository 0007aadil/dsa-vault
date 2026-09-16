class Solution {
    public int firstUniqChar(String s) {


        Deque<Integer> q = new ArrayDeque<>();
        HashMap<Character , Integer > map = new HashMap<>();

        for ( int i = 0 ; i < s.length() ; i++){

            char c  = s.charAt(i);

            map.put( c , map.getOrDefault(c,0) + 1);


        }

        

        for ( int i = 0 ; i < s.length() ; i++){

            char c = s.charAt(i);

            int val = map.get(c);
            if( val < 2){
                q.offer(i);
            }
        }

        if(q.isEmpty()) return -1 ; 

        int ans = q.poll();

        return ans ;


        
    }
}