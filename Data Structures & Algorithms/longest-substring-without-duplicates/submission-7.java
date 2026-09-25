class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        for(int i = 0; i < s.length(); i++){
            Set<Character> set = new HashSet<>();
            int end = i+1;
            set.add(s.charAt(i));

            while(end < s.length() && s.charAt(end) != s.charAt(i) &&
                 !set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                end++;
            }

            maxLength = Math.max(maxLength, set.size());
        }
        return maxLength;
    }
}
