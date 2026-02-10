class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        int resSize = (n*(n-1))/2;
        Map<Double,int[]> mp = new HashMap<>();
        PriorityQueue<Double> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                double y = (double)arr[i]/(double)arr[j];
                pq.add(y);
                if(mp.containsKey(y)) continue;
                else{
                    int [] x = new int[2];
                    x[0] = arr[i];
                    x[1] = arr[j];
                    mp.put(y,x);

                }
            }
        }
        // for (Map.Entry<Double, int[]> entry : mp.entrySet()) {
        //     System.out.print("Key: " + entry.getKey() + " -> Values: ");
        //     System.out.println(Arrays.toString(entry.getValue()));
        // }
        // System.out.println(pq);
        for(int i=0;i<k-1;i++){
        pq.poll();
        }
        return mp.get(pq.poll());
    }
}