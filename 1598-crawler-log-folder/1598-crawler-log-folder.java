class Solution {
    public int minOperations(String[] logs) {
        int ans = 0;
        for(String i : logs){
            if(i.equals("../")){
                if(ans>0)ans--;
            }
            else if(!i.equals("./")){
                ans++;
            }
            System.out.print(ans+" ");
        }
        return ans<=0 ? 0 : ans; 
    }
}