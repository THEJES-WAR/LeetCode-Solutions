class Solution {
    public int[][] kClosest(int[][] points, int k) {
        double[] bucket = new double[points.length];
        int[][] ans = new int[k][2];
        int c = 0;
        for (int[] x : points) {
            bucket[c++] = Math.sqrt(x[0] * x[0] + x[1] * x[1]);
        }
        c = 0;
        Map<Double, List<Integer>> map = new HashMap<>();
        for (double x : bucket) {
            if (!map.containsKey(x)) {
                map.put(x, new ArrayList<>());
                map.get(x).add(c++);
            } else
                map.get(x).add(c++);
        }
        double[] sortedBucket = Arrays.copyOf(bucket, bucket.length);
        Arrays.sort(sortedBucket);
        c = 0;
        for(int i=0;i<k;i++){
            double search = sortedBucket[i];
            List<Integer> list = map.get(search);
            for(int idx : list){
                if(c<k){
                    ans[c] = Arrays.copyOf(points[idx],2);
                }
                c++;
            }
        }
        return ans;
    }
}