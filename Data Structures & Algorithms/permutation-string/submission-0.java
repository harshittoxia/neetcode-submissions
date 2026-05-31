class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];

        // Build frequency array for s1
        for (char c : s1.toCharArray()) {
            s1Freq[c - 'a']++;
        }

        // Sliding window over s2
        for (int i = 0; i < s2.length(); i++) {
            s2Freq[s2.charAt(i) - 'a']++;

            // Shrink window if larger than s1
            if (i >= s1.length()) {
                s2Freq[s2.charAt(i - s1.length()) - 'a']--;
            }

            // Compare frequency arrays
            if (Arrays.equals(s1Freq, s2Freq)) {
                return true;
            }
        }

        return false;
    }
}
