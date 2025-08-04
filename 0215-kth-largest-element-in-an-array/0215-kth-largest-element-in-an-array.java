class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue x = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            x.add(nums[i]);
        }
        for(int i=0;i<nums.length-k;i++){
            x.poll();
        }
        return (int)x.peek();
    }
}