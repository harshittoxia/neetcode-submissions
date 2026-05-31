class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resp = new ArrayList<>();
        resp.add(new ArrayList<Integer>());

        for(int num: nums){
            int size = resp.size();

            for(int i = 0; i < size; i++){
                List<Integer> subset = new ArrayList<>(resp.get(i));
                subset.add(num);
                resp.add(subset);
            }
        }
        return resp;
    }
}
