class KthLargest {
    private Queue<Integer> minpq = new PriorityQueue<>();
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int n: nums){
            add(n);
        }
    }
    
    public int add(int val) {
        if(minpq.size() < this.k){
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
