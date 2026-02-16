class Solution {
    public List<Integer> stableMountains(int[] height, int t) {
        List<Integer> x = new ArrayList<>();
        int prev = height[0];
        for(int i=1;i<height.length;i++){
            if(prev>t){
                x.add(i);
            }
            prev = height[i];
        }
        return x;
    }
}