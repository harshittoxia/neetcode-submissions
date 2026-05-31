class Solution {
    public int trap(int[] height) {
        
        int start = 0;
        int end = height.length - 1;

        int minleft = height[start];
        int minRight = height[end];
        int water = 0;

        while(start < end){
            if(minleft < minRight){
                start++;

                minleft = Math.max(minleft, height[start]);
                water += minleft - height[start];
            }else{
                end--;

                minRight = Math.max(minRight, height[end]);
                water += minRight - height[end];
            }
        }

        return water;
    }
}
