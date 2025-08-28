class Solution {
    public int[] constructRectangle(int area) {
        int max=Integer.MAX_VALUE;
        int arr[]=new int[2];
        for(int i=1;i<=area;i++)
        {
            int val1=0,val2=0;
            if(area%i==0)
            {
                val1=area/i;
                val2=i;
                if(val1>=val2)
                {
                    if(val1-val2<max)
                    {
                        max=val1-val2;
                        arr[0]=val1;
                        arr[1]=val2;
                    }
                }
            }
        }
        return arr;
    }
}