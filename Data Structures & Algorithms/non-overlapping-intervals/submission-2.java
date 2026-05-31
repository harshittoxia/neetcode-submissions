class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0) return 0;

        List<int[]> modifiedList = new ArrayList<>();
        for(int i = 0; i < intervals.length; i++){
            modifiedList.add(intervals[i]);
        }

        Collections.sort(modifiedList, (a,b) -> Integer.compare(a[0], b[0]));

        int response = 0;

        for(int i = 1; i < modifiedList.size(); i++){
            int[] prev = modifiedList.get(i - 1);
            int[] current = modifiedList.get(i);

            if(prev[1] > current[0]){
                response++;
                current[1] = Math.min(current[1], prev[1]);
            }
        }
        return response;
    }
}
