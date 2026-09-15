class Solution {
    public int[] dailyTemperatures(int[] k) {


        Deque<Integer> stack = new ArrayDeque<>();
        int[] arr = new int[k.length ];
        stack.push(0);

        for ( int i = 0 ; i < k.length ; i++){
            int val = k[i];

            while ( !stack.isEmpty() && val > k[stack.peek()] ){
                int temp = stack.pop();
                arr[temp] = i - temp;
            }

            stack.push(i);

            
            
        }

        return arr;
        
    }
}