class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n=nums.length,count=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)count++;
        }
        int arr[]=new int[count];
        int j=0,dif=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                if(dif==0)
                {
                    dif=i+1;
                }
                else
                {
                    arr[j]=(i-dif);
                    if(arr[j]<k)return false;
                    dif=i+1;
                    j++;
                }
            }
        }
        return true;
    }
}