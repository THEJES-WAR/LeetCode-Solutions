class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        if (n <= 2)
            return 0;
        int diff = 0;
        int l = 0, tptr = 0, r = 1;
        int ans = 0;
        diff = nums[r] - nums[tptr];
        while (r < n) {
            if(nums[tptr] + diff ==nums[r]){
                tptr++;
            }
            else{
                diff = nums[r] - nums[tptr];
                ans += ((tptr-l-1) * (tptr- l))/2;
                l = tptr;
                r--;
            }
            r++;
        }
        ans += ((tptr-l-1) * (tptr-l))/2;
        return ans;
    }
}