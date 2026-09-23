class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);
        for(int[] interval : intervals){
            int[] lastPair = result.remove(result.size()-1);
            if(interval[0] > lastPair[1]){
                result.add(lastPair);
                result.add(new int[]{interval[0], interval[1]});
            } else{
                int start = Math.min(lastPair[0], interval[0]);
                int end = Math.max(lastPair[1], interval[1]);
                result.add(new int[]{start, end});
            }
        }
        return result.toArray(new int[result.size()][]);
        
    }
}
