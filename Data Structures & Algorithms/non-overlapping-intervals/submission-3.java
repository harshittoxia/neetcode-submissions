class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0) return 0;

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        int response = 0;

        for(int i = 1; i < intervals.length; i++){
            int[] prev = intervals[i - 1];
            int[] current = intervals[i];

            if(prev[1] > current[0]){
                response++;
                current[1] = Math.min(current[1], prev[1]);
            }
        }
        return response;
    }
}
