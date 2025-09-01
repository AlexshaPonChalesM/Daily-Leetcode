class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] fre = new int[256]; 
        int j = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (fre[c] == 1) {
                fre[s.charAt(j)]--;
                j++;
            }
            fre[c]++;
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}
