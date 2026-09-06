class KthLargest {
    private Queue<Integer> maxpq = new PriorityQueue<>();
    private int element;

    public KthLargest(int k, int[] nums) {
        element = k;
        for(int i=0; i<nums.length; i++){
            if(maxpq.size() < element){
                maxpq.add(nums[i]);
            } else {
                if(nums[i]>=maxpq.peek()){
                    maxpq.remove();
                    maxpq.add(nums[i]);
                }
            }
        }
    }
    
    public int add(int val) {
        if(maxpq.size() < element){
            maxpq.add(val);
        } else {
            if(val>=maxpq.peek()){
                maxpq.remove();
                maxpq.add(val);
            }
        }
        return maxpq.peek();
    }
}
