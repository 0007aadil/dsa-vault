class MyQueue {

    Deque<Integer> stack ;
    Deque<Integer> temp ;


    public MyQueue() {
        stack = new ArrayDeque<>();
        temp = new ArrayDeque<>();





        
    }
    
    public void push(int x) {

        

        while( !stack.isEmpty()){
            int val = stack.pop();
            temp.push(val);
        }
         stack.push(x);

        while(!temp.isEmpty()){
            int val = temp.pop();
            stack.push(val);

        }

        
    }
    
    public int pop() {

        if( stack.isEmpty()){
             return -1;
            
        }



       return  stack.pop();
        
    }
    
    public int peek() {
         if( stack.isEmpty()){
            return -1;
        }

        

       


     return stack.peek();



        
    }
    
    public boolean empty() {

        

        return stack.isEmpty() ;
        
    }
}