class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        double resp = 0.0d;

        for(int i = 0; i < nums1.length; i++){
            list.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            list.add(nums2[i]);
        }
        Collections.sort(list);

       int totalLength = list.size();

        if(totalLength % 2 == 0){
            resp = (list.get(totalLength/2-1) + list.get(totalLength/2)) / 2.0;
        }else{
            resp = list.get(totalLength/2);
        }
        return resp;
    }
}
