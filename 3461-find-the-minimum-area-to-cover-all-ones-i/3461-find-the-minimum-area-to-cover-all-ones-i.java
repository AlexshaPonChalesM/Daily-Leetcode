class Solution {
    public int minimumArea(int[][] grid) {
        int count=0;
        int n=grid.length;
        int m=grid[0].length;
        int fre[]=new int[n];
        int mrow=n,marow=-1,mcol=m,macol=-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    count++;
                    mrow=Math.min(mrow,i);
                    marow=Math.max(marow,i);
                    mcol=Math.min(mcol,j);
                    macol=Math.max(macol,j);
                }
            }
        }
        if(count==0)return 0;
        if(count==1)return 1;
        int rval=(marow-mrow)+1;
        int cval=(macol-mcol)+1;
        return rval*cval;
    }
}