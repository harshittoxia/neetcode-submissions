class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> resp = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for(int i = 0; i < strs.length; i++){
            if(visited[i]) continue;

            List<String> anagramPairs = new ArrayList<>();
            anagramPairs.add(strs[i]);
            visited[i] = true;

            for(int j = i+1; j < strs.length; j++){
                if(!visited[j] && strs[i].length() == strs[j].length()){
                    String one = strs[i];
                    String two = strs[j];
                    boolean isAnagram = true;
                    int[] freq = new int[26];
                    for(char c: one.toCharArray()){
                        freq[c - 'a']++;
                    }

                    for(char c: two.toCharArray()){
                        freq[c - 'a']--;
                        if(freq[c - 'a'] < 0){
                            isAnagram = false;
                            break;
                        }
                    }

                    if(isAnagram){
                        anagramPairs.add(two);
                        visited[j] = true;
                    }
                }
            }

            resp.add(anagramPairs);
        }
        
        return resp;
    }
}
