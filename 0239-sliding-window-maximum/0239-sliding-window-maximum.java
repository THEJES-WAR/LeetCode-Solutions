class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if(k==1) return nums;
        int[] ar = new int[n - (k - 1)];
        int l = 0, tptr = 0, r = 1;
        while (r < n) {
            if(tptr<l){
                int c = l;
                tptr = l+1;
                while(c<=r){
                    if(nums[c]>nums[tptr]) tptr = c;
                    c++;
                }
            }
            if(nums[r]>nums[tptr]){
                tptr = r;
            }
            if(r-l==k-1) ar[l++] = nums[tptr];
            r++;
        }
        return ar;
    }
}