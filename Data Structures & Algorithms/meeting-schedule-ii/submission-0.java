/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int l = intervals.size();
        int[] sArr = new int[l];
        int[] eArr = new int[l];
        int i =0;

        for(Interval interval : intervals){
            sArr[i] = interval.start;
            eArr[i] = interval.end;
            i++;
        }
        
        Arrays.sort(sArr);
        Arrays.sort(eArr);
        i=0;
        int j=0;
        int count =0;
        int ans =0;
        while(i<l){
            if(sArr[i]<eArr[j]){
                count++;
                i++;
            } else{
                count--;
                j++;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}
