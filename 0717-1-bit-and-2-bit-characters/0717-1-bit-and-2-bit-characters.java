class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n=bits.length;
        int count=n;
        if(n==1 && bits[0]==0)return true;
        for(int i=0;i<n;i++)
        {
            if(bits[i]==1)
            {
                i++;
                count-=2;
            }
            else if(i!=n-1 && bits[i]==0)
            {
                count-=1;
            }
        }
        if(count==0)return false;
        return true;
    }
}