class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0) return intervals;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> response = new ArrayList<>();
        response.add(intervals[0]);

        for(int i = 1; i < intervals.length; i++){
            int[] prev = intervals[i-1];
            int[] current = intervals[i];

            if(current[0] <=  prev[1]){
                current[0] = Math.min(current[0], prev[0]);
                current[1] = Math.max(current[1], prev[1]);
                response.remove(prev);
            }
            response.add(current);
        }

        int[][] mergedResult = new int[response.size()][2];
        for(int i = 0; i < response.size(); i++){
            mergedResult[i] = response.get(i);
        }

        return mergedResult;
    }
}
