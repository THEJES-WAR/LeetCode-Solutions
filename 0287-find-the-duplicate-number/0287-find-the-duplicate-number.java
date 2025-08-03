class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] fr = new boolean[100001];
        for(int x : nums){
            if(fr[x]==true) return x;
            else fr[x] = true;
        }
        return 0;
    }
}