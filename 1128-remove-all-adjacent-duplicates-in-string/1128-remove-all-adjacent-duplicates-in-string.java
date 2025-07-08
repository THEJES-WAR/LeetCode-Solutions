class Solution {
    public String removeDuplicates(String s) {
        char[] c = new char[s.length()];
        int top=-1;
        for(char ch : s.toCharArray()){
            if(top!=-1 && c[top]==ch){
                top--;
            }
            else{
                c[++top]=ch;
            }
        }
        return new String(c, 0, top+1 );

    }
}