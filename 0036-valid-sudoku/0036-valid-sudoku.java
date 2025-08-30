class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++)
        {
            int fre[]=new int[10];
            int freq[]=new int[10];
            for(int j=0;j<9;j++)
            { 
                if(board[i][j]!='.')
                {
                    if(fre[board[i][j]-'0']==1)
                        return false;
                    else fre[board[i][j]-'0']++;
                }   
                if(board[j][i]!='.')
                {  
                    if(freq[board[j][i]-'0']==1)
                        return false;
                    else freq[board[j][i]-'0']++;
                }
            }
        }
        for (int a = 0; a < 9; a += 3) 
        {
            for (int b = 0; b < 9; b += 3) 
            {
                int count[] = new int[10];
                for (int i = a; i < a + 3; i++) 
                {
                    for (int j = b; j < b + 3; j++) 
                    {
                        if (board[i][j] != '.') 
                        {
                            if (count[board[i][j] - '0'] == 1) return false;
                            count[board[i][j] - '0']++;
                        }
                    }
                }
            }
        }
        return true;
    }
}