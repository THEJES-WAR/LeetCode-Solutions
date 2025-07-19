class Solution {
    public String makeGood(String st) {
        Stack<Character> s = new Stack<>();
        for(char ch : st.toCharArray()){
            if(!s.isEmpty() && Math.abs(s.peek()-ch)==32) s.pop();
            else s.add(ch);
        }
        st="";
        for (char ch : s) {
            st+=ch;
        }
        return st;
    }
}