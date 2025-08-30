class Solution {
    public int passThePillow(int n, int t) {
        int x=1,flag=0;
        while(t!=0){
            if(x==n) flag=1;
            if(x==1) flag=0;
            if(flag==1){
                x--;
            } 
            else{
                x++;
            }
            t--;
        }
        return x;
    }
}