class MedianFinder {

    private Queue<Integer> maxHeap;
    private Queue<Integer> minHeap;

    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(maxHeap.isEmpty() || num <= maxHeap.peek()){
            maxHeap.add(num);
        } else{
            minHeap.add(num);
        }
        int diff = Math.abs(maxHeap.size() - minHeap.size());
        if(diff>1){
            if(maxHeap.size()>minHeap.size()){
                minHeap.add(maxHeap.remove());
            } else{
                maxHeap.add(minHeap.remove());
            }
        }
    }
    
    public double findMedian() {
        if(maxHeap.size()>minHeap.size()){
            return maxHeap.peek();
        } else if(minHeap.size()>maxHeap.size()){
            return minHeap.peek();
        } else{
            int median = maxHeap.peek() + minHeap.peek();
            return median/2.0;
        }
        
    }
}
