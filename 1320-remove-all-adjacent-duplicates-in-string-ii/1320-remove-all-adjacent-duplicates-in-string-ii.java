class Solution {
    public String removeDuplicates(String s, int k) {
        char[] x = new char[s.length()];
        int[] count = new int[s.length()];
        int top=-1;
        for(char c : s.toCharArray()){
            x[++top]=c;
            if(top>0 && x[top]==x[top-1]){
                count[top]=count[top-1]+1;
            }
            else{
                count[top]=1;
            }
            if(count[top]==k){
                top=top-k;
            }
        }
        return new String(x,0,top+1);
    }
}