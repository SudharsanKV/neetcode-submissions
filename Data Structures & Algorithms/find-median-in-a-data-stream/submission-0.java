class MedianFinder {

    private Queue<Integer> maxpq;
    private Queue<Integer> minpq;

    public MedianFinder() {
        maxpq = new PriorityQueue<>(Collections.reverseOrder());
        minpq = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        // maxpq.add(num);
        if(maxpq.isEmpty() || num<=maxpq.peek()){
            maxpq.add(num);
        }else{
            minpq.add(num);
        }
        
        int diff = Math.abs(maxpq.size() - minpq.size());
        if(diff >1){
            if(maxpq.size()>minpq.size()){
                minpq.add(maxpq.remove());
            } else{
                maxpq.add(minpq.remove());
            }
        }
    }
    
    public double findMedian() {
        if(maxpq.size()>minpq.size()){
            return maxpq.peek();
        } else if (minpq.size()>maxpq.size()){
            return minpq.peek();
        } else {
            return (maxpq.peek()+minpq.peek())/2.0;
        }
    }
}
