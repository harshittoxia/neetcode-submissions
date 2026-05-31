class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        int[] frq = new int[26];
        for(char a: s.toCharArray()){
            frq[a - 'a']++;
        }

        for(char a: t.toCharArray()){
            frq[a - 'a']--;

            if(frq[a - 'a'] < 0){
                return false;
            }
        }

        return true;
    }
}
