class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int n=dimensions.length;
        double max=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int val1=dimensions[i][0];
            int val2=dimensions[i][1];
            double square=Math.sqrt((val1*val1)+(val2*val2));
            if(max<square)
            {
                ans=val1*val2;
                max=square;
            }
            else if(max==square && ans<val1*val2)
            ans=val1*val2;
        }
        return ans;
    }
}