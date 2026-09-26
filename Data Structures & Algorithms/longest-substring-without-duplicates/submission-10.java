class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Set<Character> set = new HashSet<>();

        int start = 0;
        for(int end = 0; end < s.length(); end++){
            while(set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(end));

            maxLength = Math.max(maxLength, set.size());
        }
        return maxLength;
    }
}
