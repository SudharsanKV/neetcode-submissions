class KthLargest {
    private Queue<Integer> minpq = new PriorityQueue<>();
    private int element;

    public KthLargest(int k, int[] nums) {
        element = k;
        for(int n: nums){
            add(n);
        }
    }
    
    public int add(int val) {
        if(minpq.size() < element){
            minpq.add(val);
        } else {
            if(val>=minpq.peek()){
                minpq.remove();
                minpq.add(val);
            }
        }
        return minpq.peek();
    }
}
