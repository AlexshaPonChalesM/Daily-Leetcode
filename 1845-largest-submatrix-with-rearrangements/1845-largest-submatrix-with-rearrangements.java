class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==1)
                matrix[i][j]+=matrix[i-1][j];
            }
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
            int row[]=matrix[i].clone();
            Arrays.sort(row);
            for(int j=0;j<m;j++)
            {
                int hval=row[m-1-j];
                int width=j+1;
                max=Math.max(hval*width,max);
            }
        }
        return max;
    }
}