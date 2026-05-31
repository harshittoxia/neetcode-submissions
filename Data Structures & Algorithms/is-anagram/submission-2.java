class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> maplist = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            maplist.put(s.charAt(i), maplist.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < t.length(); i++) {
            maplist.put(t.charAt(i), maplist.getOrDefault(t.charAt(i), 0) - 1);
        }

        for(Map.Entry<Character, Integer> entry : maplist.entrySet()){
            if(entry.getValue() > 0 || entry.getValue() < 0) {
                return false;
            }
        }

        return true;
    }
}
