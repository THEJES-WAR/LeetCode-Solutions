class Solution {
    public int findLargest(int[] arr,int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n) return i;
        }
        return 0;
    }
    public void flip(int [] arr,int l){
        int i=0,j=l;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public List<Integer> pancakeSort(int[] arr) {
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        for(int i = n;i>1;i--){
            int idx = findLargest(arr,i);
            flip(arr,idx);
            ans.add(idx+1);
            flip(arr,i-1);
            ans.add(i);
        }
        return ans;
    }
}