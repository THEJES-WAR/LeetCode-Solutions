class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num:stones){
            pq.add(num);
        }
        while(pq.size()>1){
            int p = pq.poll();
            int q = pq.poll();
            if(p!=q){
                pq.add(p-q);
            }
        }
        if(pq.isEmpty()) return 0;
        return pq.poll();
    }
}