class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> fMap = new HashMap<>();
        for (int n : nums) {
            fMap.put(n, fMap.getOrDefault(n, 0) + 1);
        }
        
        // 2. Keep a Min-Heap of size K based on frequency values
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a, b) -> fMap.get(a) - fMap.get(b)
        );
        
        for (int num : fMap.keySet()) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll(); // Evict the least frequent element
            }
        }
        
        // 3. Populate the exact result array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }
        
        return result;
    }
}
