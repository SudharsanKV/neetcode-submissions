class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> fMap = new HashMap<>();
        for(int n: nums){
            fMap.put(n, fMap.getOrDefault(n,0)+1);
        }
        List<int[]> ans = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: fMap.entrySet()){
            ans.add(new int[] {entry.getKey(), entry.getValue()});
        }
        ans.sort((a,b) -> b[1]-a[1]);
        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i] = ans.get(i)[0];
        }
        return result;
    }
}
