class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        int start = 0;
        int end = 0;
        int resp = 0;
        int mxfq = 0;

        while(end < s.length()){
            map.put(s.charAt(end), map.getOrDefault(s.charAt(end), 0) + 1);
            mxfq = maxFrequency(map);

            while((end - start + 1) - mxfq > k){
                map.put(s.charAt(start), map.get(s.charAt(start)) - 1);
                start++;
            }
            resp = Math.max(resp, end - start + 1);
            end++;
        }
        return resp;
    }

    private int maxFrequency(Map<Character, Integer> map) {
        int maxFreq = 0;

        for (int freq : map.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        return maxFreq;
    }
}
