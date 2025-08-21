class Solution {
    public void duplicateZeros(int[] arr) {
        List<Integer> x = new ArrayList<>();
        int c = 0;
        for(int i : arr){
            x.add(i);
            if(i==0){
                x.add(0);
                c++;
            }
            if(c>arr.length) break;
            c++;
        }
        int j=0;
        for(int i : x){
            if(j<arr.length)arr[j++] = i;
        }
    }
}