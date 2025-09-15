class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int len=brokenLetters.length();
        Set<Character> set=new HashSet<>();
        for(int i=0;i<len;i++)
        {
            set.add(brokenLetters.charAt(i));
        }
        String str[]=text.split(" ");
        int n=str.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            int l=str[i].length();
            int flag=1;
            for(int j=0;j<l;j++)
            {
                if(set.contains(str[i].charAt(j)))
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)count++;
        }
        return count;
    }
}