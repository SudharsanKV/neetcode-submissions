class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> fMap = new HashMap<>();
        for (int n : nums) {
            fMap.put(n, fMap.getOrDefault(n, 0) + 1);
        }
        
        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : fMap.entrySet()) {
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }
        arr.sort((a, b) -> b[0] - a[0]);
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr.get(i)[1];
        }
        
        return result;
    }
}
