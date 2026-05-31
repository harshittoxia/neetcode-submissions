class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            list.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            list.add(nums2[i]);
        }
        Collections.sort(list);

        int start = 0;
        int end = list.size() - 1;

        if(list.size() % 2 == 0){
            int midIdx = (start + end) / 2;
            return (list.get(midIdx) + list.get(midIdx+1)) / 2.0;
        }else{
            return list.get(list.size() / 2);
        }
    }
}
