class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int start[]=new int[n];
        int end[]=new int[n];
        start[0]=height[0];
        end[n-1]=height[n-1];
        for(int i=1;i<n;i++)
        start[i]=Math.max(start[i-1],height[i]);
        for(int i=n-2;i>=0;i--)
        end[i]=Math.max(end[i+1],height[i]);
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=Math.min(start[i],end[i])-height[i];
        }
        return sum;
    }
} 