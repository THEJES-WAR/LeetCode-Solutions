class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max = 0;
        for(int i : costs){
            max = Math.max(max,i);
        }
        int[] bucket = new int[max+1];
        for(int i : costs){
            bucket[i]++;
        }
        int count =0;
        for(int i=1;i<bucket.length;i++){
            if(bucket[i]==0) continue;
            int buy = Math.min(bucket[i],coins/i);
            count += buy;
            coins -= buy*i;

        }
        return count;
    }
}