class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> newIntervals = new ArrayList<>();

        newIntervals.add(newInterval);
        for(int i = 0; i < intervals.length; i++){
            newIntervals.add(intervals[i]);
        }

        newIntervals.sort((a,b) -> a[0] - b[0]);

        int start = 1;
        while(start < newIntervals.size()){
            int[] prev = newIntervals.get(start - 1);
            int[] current = newIntervals.get(start);

            if(current[0] <= prev[1]){
                newIntervals.remove(start - 1);
                current[0] = Math.min(prev[0], current[0]);
                current[1] = Math.max(prev[1], current[1]);
            }else{
                start++;
            }
        }

        int[][] result = new int[newIntervals.size()][2];
        for(int i = 0; i < newIntervals.size(); i++){
            result[i] = newIntervals.get(i);
        }

        return result;
    }
}
