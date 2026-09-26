class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        int longest = 0;
        int start = 0;
        int end = 0;
        int maxFeq = 0;

        while(end < s.length()){
            map.put(s.charAt(end), map.getOrDefault(s.charAt(end), 0) + 1);

            while((end - start + 1) - maxFrequency(map) > k) {
                map.put(s.charAt(start), map.get(s.charAt(start)) - 1);
                start++;
            }
            longest = Math.max(longest, end - start + 1);
            end++;
        }
        return longest;
    }

    int maxFrequency(HashMap<Character, Integer> map){
        int maxFreq = 0;

        for(Map.Entry<Character, Integer> m: map.entrySet()) {
            maxFreq = Math.max(maxFreq, m.getValue());
        }
        return maxFreq;
    }
}
