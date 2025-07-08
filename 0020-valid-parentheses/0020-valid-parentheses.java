class Solution {
    public boolean isValid(String s) {
        Stack<Character> x = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='[') x.push(ch);
            else{
                if(x.isEmpty()) return false;
                else{
                    char top = x.pop();
                    if((top=='{' && ch!='}') || (top=='(' && ch!=')') || (top=='[' && ch!=']')) return false;
                }
            }
        }
        return x.isEmpty();
    }
}