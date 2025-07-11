class Solution {
    public int minLength(String s) {
        Stack<Character> x = new Stack<>();
        for(char ch : s.toCharArray()){
            if((x.size()>=1 && ch=='B' && x.peek()=='A') || (x.size()>=1 && ch=='D' && x.peek()=='C')) x.pop();
            else x.push(ch);
        }
        return x.size();
    }
}