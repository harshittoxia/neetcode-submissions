class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        if(t.equals(s)) return t;

        HashMap<Character, Integer> counter = new HashMap<>();

        for(int i = 0; i < t.length(); i++){
            counter.put(t.charAt(i), counter.getOrDefault(t.charAt(i), 0) + 1);
        }

        int start = 0, end = 0;
        int required = counter.size();
        int formed = 0;
        int minLength = Integer.MAX_VALUE;
        int minStart = 0;

        HashMap<Character, Integer> window = new HashMap<>();

        while(end < s.length()){
            char endChar = s.charAt(end);
            window.put(endChar, window.getOrDefault(endChar, 0) + 1);

            if(counter.containsKey(endChar) && counter.get(endChar).intValue() == window.get(endChar).intValue()){
                formed++;
            }

            while(start <= end && required == formed){
                char startChar = s.charAt(start);
                if((end - start) + 1 < minLength){
                    minStart = start;
                    minLength = (end - start) + 1;
                }

                window.put(startChar, window.get(startChar) - 1);
                if(counter.containsKey(startChar) && window.get(startChar).intValue() < counter.get(startChar).intValue()){
                    formed--;
                }
                start++;
            }
            
            end++;
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLength);
    }
}
