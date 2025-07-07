class MinStack {
    node start;
    class node{
        int data;
        int min;
        node next;
        node(int d,int m){
            data = d;
            min = m;
            next = null;
        }
    }
    public MinStack() {
        
    }
    
    public void push(int val) {

        if(start==null) {
            start= new node(val,val);
            return;
        }
        int curr_min = Math.min(val,start.min);
        node newnode = new node(val,curr_min);
        newnode.next = start;
        start = newnode;

    }
    
    public void pop() {
        start = start.next;
    }
    
    public int top() {
        return start.data;
    }
    
    public int getMin() {
        return start.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */