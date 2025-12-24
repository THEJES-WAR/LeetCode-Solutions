class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int s = 0;
        for(int i: apple){
            s+=i;
        }
        int n = capacity.length - 1;
        while(s>0){
            s = s-capacity[n--];
        }
        return capacity.length - n-1;

    }
}