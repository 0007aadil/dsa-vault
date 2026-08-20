class Solution {
    public String minWindow(String s, String t) {

        if ( s.length() < t.length()){
            return "";
        }

        HashMap<Character , Integer> arr2 = new HashMap<>();

        for ( int i = 0 ; i < t.length(); i++){
            char c = t.charAt(i);
            arr2.put(c , arr2.getOrDefault(c,0) + 1 );
        }


        int high = 0 ;
        int low = 1 ;
        int[] arr = new int[2];
        int min = Integer.MAX_VALUE;

        HashMap<Character , Integer> map = new HashMap<>();
        if( s.length() > 0 ){
            char c = s.charAt(0);
            map.put(c , map.getOrDefault(c , 0) + 1 );
            
        }

        while ( high <= s.length() && low <= s.length()){

            if ( low - high + 1 < t.length()){

                if ( low < s.length()){

                    char c = s.charAt(low);
                    map.put(c , map.getOrDefault(c , 0)+ 1 );

                }

               
                low++;
                continue ; 
            }

           


            boolean b = true  ;

            for ( char c : arr2.keySet()){
                if ( map.getOrDefault(c , 0) < arr2.get(c)){
                    b = false ;
                }
            }
           



            if(b ){
                
                int val = low - high +1 ;
                if (val < min){
                    arr[0] = high;
                    arr[1] = low;
                    min = val ;
                }

                char c = s.charAt(high);
                map.put(c, map.get(c) - 1 );
                high++;

            }else {
                    if ( low < s.length()){
                        char c = s.charAt(low);
                        map.put(c , map.getOrDefault(c , 0 ) + 1 );
                    }
                    low++;
            }

            
        }
        String h = "";

        for ( int i = arr[0]; i < arr[1]; i++){
            char c = s.charAt(i);
            h = h + c;
        }

        return h;
        
    }
}