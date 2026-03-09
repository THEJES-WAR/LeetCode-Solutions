class Solution {
    long ic = 0;
    public void helper(long k,long limit, int[] o, int s){
        if(k==1L || s<0) return;
        long mid = limit/2L;
        if(k>mid){
            k = k - mid;
            ic += o[s]==1 ? 1 :  0;
        }
        helper(k,limit/2L,o,s-1);
    }
    public char kthCharacter(long k, int[] o) {
        int size = o.length;
        long limit = 0;
        for(limit = 1;limit<k;limit*=2);
        int idx = (int)(Math.log(limit)/Math.log(2));
        helper(k,limit,o,idx-1);
        ic = ic%26;
        return (char)('a'+ic);
    }
}