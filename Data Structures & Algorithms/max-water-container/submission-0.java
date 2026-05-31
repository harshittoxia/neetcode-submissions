class Solution {
    public int maxArea(int[] heights) {
        if(heights.length == 0) return 0;
        int resp = 0;

        int l = 0;
        int r = heights.length - 1;

        while(l < r){
            resp = Math.max(resp,
             Math.min(heights[l], heights[r]) * (r - l));

             if(heights[l] <= heights[r]){
                l++;
             }else{
                r--;
             }
        }

        return resp;
    }
}
