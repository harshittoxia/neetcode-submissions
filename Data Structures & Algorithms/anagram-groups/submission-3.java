class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            char[] currentCharArr = strs[i].toCharArray();
            Arrays.sort(currentCharArr);
            String current = String.valueOf(currentCharArr);

            List<String> val = map.getOrDefault(current, new ArrayList<String>());
            val.add(strs[i]);
            map.put(current, val);
        }

        return new ArrayList<>(map.values());
    }
}
