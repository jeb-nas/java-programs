class MinStack {
 Stack<Integer>s=new Stack<>();
 Stack<Integer>ms=new Stack<>();
        
    
    public void push(int val) {
        

        s.push(val);
        if(ms.isEmpty())
        ms.push(val);
        else
        ms.push(Math.min(val,ms.peek()));
    }
    
    public void pop() {
        s.pop();
        ms.pop();
        
         
    }
    
    public int top() {
         if(!s.isEmpty())
         return s.peek();
        return -1;
    }
    
    public int getMin() {
        return ms.peek();
    }
}
