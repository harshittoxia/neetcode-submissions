class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mapList = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char[] currentChar = strs[i].toCharArray();
            Arrays.sort(currentChar);
            String sortedStr = new String(currentChar);
            mapList.putIfAbsent(sortedStr, new ArrayList<>());
            mapList.get(sortedStr).add(strs[i]);
        }
        return new ArrayList<>(mapList.values());
    }
}
