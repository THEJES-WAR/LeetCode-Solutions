class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map <Double,Integer> map = new HashMap<>();
        long ans = 0;
        int d=0;
        for(int[] i: rectangles){
            double a = (double)i[0] / (double)i[1];
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }
            else map.put(a,1);
        }
        for(Map.Entry<Double,Integer> entry : map.entrySet()){
            long a = entry.getValue()-1;
            if(a==0) continue;
            ans += (a*(a+1))/2;
        }
        return ans;
    }
}