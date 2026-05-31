class Solution {
    public int characterReplacement(String s, int k) {
       if(s.isEmpty()) return 0;
       int[] freq = new int[26];

       int left = 0;
       int maxLength = 0;
       int mostFreq = 0;

       for(int right = 0; right < s.length(); right++){
        freq[s.charAt(right) - 'A']++;
        mostFreq = Math.max(mostFreq, freq[s.charAt(right) - 'A' ]);

        while((right - left + 1) - mostFreq  > k){
            freq[s.charAt(left) - 'A' ]--;
            left++;
        }

        maxLength = Math.max(maxLength, right - left + 1);
       }

       return maxLength;
    }
}
