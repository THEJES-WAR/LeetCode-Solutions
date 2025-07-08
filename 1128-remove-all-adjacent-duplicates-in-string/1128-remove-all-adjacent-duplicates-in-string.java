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
        String x = "";
        for(int i=0;i<=top;i++){
            x+=c[i];
        }
        return x;
    }
}