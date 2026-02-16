class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        for(String i : words){
            map.put(i,map.getOrDefault(i,0) + 1);
        }
        List<String> bucket[] = new List[words.length+1];
        for(var key : map.entrySet()){
            int freq = key.getValue();
            if(bucket[freq]==null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key.getKey());
        }
        List<String> ans = new ArrayList<>();
        int c = 0;
        for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i]==null) continue;
            Collections.sort(bucket[i]); 
            for(String x : bucket[i]){
                if(ans.size()==k) break;
                ans.add(x);
            }
        }
        return ans;
    }
}