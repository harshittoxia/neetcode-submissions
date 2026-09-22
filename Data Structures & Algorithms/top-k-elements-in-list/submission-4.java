class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        } 

        List<int[]> list = new ArrayList<>();
        map.forEach((key,value) -> {
            list.add(new int[]{value, key});
        });
        list.sort((a,b) -> b[0] - a[0]);

        int[] resp = new int[k];
        for(int i = 0; i < k; i++){
            resp[i] = list.get(i)[1];
        }
        return resp;
    }
}
