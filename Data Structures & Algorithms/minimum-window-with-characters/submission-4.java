class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for(int i = 0; i < t.length(); i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
            window.put(t.charAt(i), 0);
        }

        int start = 0;
        int end = 0;
        int minLength = Integer.MAX_VALUE;
        int[] arr = new int[2];

        while(end < s.length()){
            if(map.containsKey(s.charAt(end))){
                window.put(s.charAt(end), window.getOrDefault(s.charAt(end), 0) + 1);
            }

            while (containsAll(map, window)) {
                if(minLength > end - start + 1){
                    minLength = end - start + 1;
                    arr[0] = start;
                    arr[1] = end;
                }

                if(window.containsKey(s.charAt(start))) {
                    window.put(s.charAt(start), window.get(s.charAt(start)) - 1);
                }
                start++;
            }
            end++;
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(arr[0], arr[1] + 1);
    }

    private boolean containsAll(
            HashMap<Character, Integer> map,
            HashMap<Character, Integer> window) {

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char c = entry.getKey();
            int required = entry.getValue();

            if (window.getOrDefault(c, 0) < required) {
                return false;
            }
        }

        return true;
    }
}
