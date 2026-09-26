class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";

        HashMap<Character, Integer> tmap = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for(int i = 0; i < t.length(); i++){
            tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0) + 1);
        }

        int start = 0;
        int end = 0;
        int minLength = Integer.MAX_VALUE;
        int[] repArr = new int[2];
        int have = 0;
        int need = tmap.size();

        while(end < s.length()){
            char current = s.charAt(end);
            window.put(current, window.getOrDefault(current, 0) + 1);

            if(tmap.containsKey(current)){
                if(window.get(current).equals(tmap.get(current))){
                    have++;
                }
            }

            while(have == need){
                if(minLength > end - start + 1){
                    minLength = end - start + 1;
                    repArr[0] = start;
                    repArr[1] = end;
                }

                char currentStart = s.charAt(start);
                window.put(currentStart, window.get(currentStart) - 1);
                if(tmap.containsKey(currentStart)
                    && window.get(currentStart) < tmap.get(currentStart)){
                        have--;
                }
                start++;
            }
            end++;
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(repArr[0], repArr[1] + 1);
    }
}
