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
    public boolean canAttendMeetings(List<Interval> intervals) {
        int [] s = new int[intervals.size()];
        int [] e = new int[intervals.size()];
        int j =0; 
        for(Interval i : intervals){
            s[j] = i.start;
            e[j] = i.end;
            j++;
        }
        Arrays.sort(s);
        Arrays.sort(e);
        for(int i =1; i< intervals.size(); i++){
            if(s[i]<e[i-1]){
                return false;
            }
        }
        return true;

    }
}
