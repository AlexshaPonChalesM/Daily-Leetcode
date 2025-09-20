class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)
        set.add(nums[i]);
        int s=set.size();
        int count=0;
        for(int i=0;i<n;i++)
        {
            Set<Integer>hash=new HashSet<>();
            for(int j=i;j<n;j++)
            {
                hash.add(nums[j]);
                if(s==hash.size())count++;
            }
        }
        return count;
    }
}