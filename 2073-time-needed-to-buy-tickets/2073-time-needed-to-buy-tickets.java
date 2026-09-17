class Solution {
    public int timeRequiredToBuy(int[] t, int k) {

        Deque<Integer> q = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for ( int i = 0 ; i < t.length; i++){

            q.addLast(i);
            map.put(i , t[i]);

        }


        int count = 0 ;
        int s = t[k];
        while ( s > 0){
            int val = q.pollFirst();

            if(val == k ){
                s--;
            }

            map.put(val, map.getOrDefault(val , 0 ) -1 );
            count++;

            if(map.get(val) > 0 ){
                q.addLast(val);
            }



        }

        return count;


        
    }
}