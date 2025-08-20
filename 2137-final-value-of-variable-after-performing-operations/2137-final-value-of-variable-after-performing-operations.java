class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int c = 0;
        for(String x : operations){
            if(x.charAt(1)=='-'){
                c--;
            }
            else c++;
        }
        return c;
    }
}