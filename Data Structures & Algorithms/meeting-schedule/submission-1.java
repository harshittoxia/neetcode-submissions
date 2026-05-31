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
        if(intervals.isEmpty()) return true;

        intervals.sort((a,b) -> Integer.compare(a.start, b.start));

        for(int i = 1; i < intervals.size(); i++){
            Interval pre = intervals.get(i - 1);
            Interval current = intervals.get(i);
            if(current.start < pre.end){
                return false;
            }
        }
        return true;
    }
}
