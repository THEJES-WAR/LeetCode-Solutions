class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1,m=0,x=0;
        while(l<r){
            x = (r-l)*Math.min(height[l],height[r]);
            if(x>m) m=x;
            if(height[l]<=height[r]){
                l++;
            }
            else if(height[l]>height[r]){
                r--;
            }
        }
        return m;
    }
}