class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> s = new Stack<>();
        for (int i : a) {
            if(i>0){
                s.push(i);
            }
            else{
                while(!s.isEmpty() && s.peek()>0 && s.peek()<-i){
                    s.pop();
                }
                if(s.isEmpty() || s.peek()<0){
                    s.push(i);
                }
                if(s.peek()==-i){
                    s.pop();
                }
            }
        }
        int n = s.size();
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = s.pop();
        }
        return ans;
    }
}

// if(i<0 && s.peek()>0){
//                     int x = Math.abs(i);
//                     int y = Math.abs(s.peek());
//                     int max = x > y ? i : s.peek();
//                     if(x==y) s.pop();
//                     else if(max == i){
//                         while(!s.isEmpty() && max==i){
//                             s.pop();
//                             if(s.isEmpty() || !(i<0 && s.peek()>0)){
//                                 s.push(i);
//                                 break;
//                             }
//                             if(Math.abs(s.peek())==Math.abs(i)) s.pop();
//                             max = x > Math.abs(s.peek()) ? i : s.peek();
//                         }
//                     }
//                 }
//                 else s.push(i);