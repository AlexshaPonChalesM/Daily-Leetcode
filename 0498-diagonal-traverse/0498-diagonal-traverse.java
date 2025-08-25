class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int ans[] = new int[n * m];
        int j = 0, ival = 0, jval = 0;
        int up = 1, len = n + m - 1;  
        for (int i = 0; i < len; i++) 
        {
            if (up == 1) 
            {  
                while (ival >= 0 && jval < m) 
                {
                    ans[j++] = mat[ival][jval];
                    ival--;
                    jval++;
                }
                if (jval < m) 
                {
                    ival++;  
                } 
                else 
                {
                    ival += 2; 
                    jval--;
                }
                up = 0;
            } 
            else 
            { 
                while (ival < n && jval >= 0) 
                {
                    ans[j++] = mat[ival][jval];
                    ival++;
                    jval--;
                }
                if (ival < n) 
                {
                    jval++;
                } 
                else 
                {
                    jval += 2;  
                    ival--;
                }
                up = 1;
            }
        }
        return ans;
    }
}
