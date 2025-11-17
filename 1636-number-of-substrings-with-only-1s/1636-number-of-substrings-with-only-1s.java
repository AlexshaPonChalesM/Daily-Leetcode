class Solution {
    public int numSub(String s) {
        int mod = 1000000007;
        long sum = 0, count = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;
            } 
            else {
                sum = (sum + (count * (count + 1) / 2) % mod) % mod;
                count = 0;
            }
        }
        sum = (sum + (count * (count + 1) / 2) % mod) % mod;
        return (int) sum;
    }
}
