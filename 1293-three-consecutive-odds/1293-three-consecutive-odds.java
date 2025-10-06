class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=i;j<n;j++)
            {
                if(arr[j]%2==0)
                break;
                else count++;
                if(count==3)return true;
            }
        }
        return false;
    }
}