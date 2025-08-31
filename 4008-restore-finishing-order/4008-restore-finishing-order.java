class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:friends){
            set.add(num);
        }
        int k=0;
        for(int num : order){
            if(set.contains(num)) friends[k++] = num;
        }
        return friends;
    }
}