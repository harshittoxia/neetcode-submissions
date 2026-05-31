class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;

        Set<Character> seen = new HashSet<>();
        int l = 0;
        int r = 0;
        int resp = 0;

        while(r < s.length()){
            if(!seen.contains(s.charAt(r))){
                seen.add(s.charAt(r));
                resp = Math.max(resp, r - l + 1);
                r++;
            }else{
                seen.remove(s.charAt(l));
                l++;
            }
        }

        return resp;
    }
}
