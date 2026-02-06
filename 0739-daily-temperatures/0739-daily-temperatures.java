class Solution {
    public int[] dailyTemperatures(int[] t) {
        int [] ans = new int[t.length];
        Stack<Integer> s = new Stack();
        for(int i=t.length-1;i>=0;i--){
            while(!s.isEmpty() && t[s.peek()]<=t[i]){
                s.pop();
            }
            ans[i] = s.isEmpty() ? 0 : s.peek()-i;
            s.push(i);
        }
        return ans;
    }
}