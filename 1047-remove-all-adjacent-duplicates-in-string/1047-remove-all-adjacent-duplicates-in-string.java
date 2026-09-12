class Solution {
    public String removeDuplicates(String s) {

        Deque <Character> q = new ArrayDeque<>();

        for( int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);

            if(!q.isEmpty() && q.peek() == c  ){
                q.pop();

            }else{
                q.push(c);
            }
        }

        String str ="";
        while( !q.isEmpty()){

            str = str + q.pop();

        
        }

        String f = "";

        for ( int i = str.length() -1 ; i >=0 ; i--){
            f = f + str.charAt(i);
        }

        return f  ;
        
    }
}