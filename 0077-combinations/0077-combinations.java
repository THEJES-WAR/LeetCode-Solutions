class Solution {
    public static void backtrack(int n,int k,int b,List<Integer> x,List<List<Integer>> f){
        if(x.size()==k){
            f.add(new ArrayList<>(x));
            return;
        }
        for(int i=b;i<=n;i++){
            x.add(i);
            backtrack(n,k,i+1,x,f);
            x.remove(x.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
       List<List<Integer>> f = new ArrayList<>();
       List<Integer> x = new ArrayList<>();
       backtrack(n,k,1,x,f);
       return f;
    }
}