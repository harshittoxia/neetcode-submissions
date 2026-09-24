class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length - 1;
        int maxStorage = 0;

        while(start < end){
            int min = Math.min(heights[start], heights[end]);
            int totalStorage = min * (end - start);
            maxStorage = Math.max(maxStorage, totalStorage);

            if(heights[end] < heights[start]) {
                end--;
            }else{
                start++;
            }
        }
        return maxStorage;
    }
}
