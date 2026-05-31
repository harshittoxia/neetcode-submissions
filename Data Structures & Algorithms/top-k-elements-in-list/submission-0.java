class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hashList = new HashMap<>();
        int[] responseArray = new int[k];
        for(int i = 0 ; i < nums.length; i++){
           hashList.put(nums[i], hashList.getOrDefault(nums[i], 0)+1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hashList.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        for (int i = 0; i < Math.min(k, list.size()); i++) {
            Map.Entry<Integer, Integer> entry = list.get(i);
            responseArray[i] = entry.getKey();
        }


        return responseArray;
    }
}
