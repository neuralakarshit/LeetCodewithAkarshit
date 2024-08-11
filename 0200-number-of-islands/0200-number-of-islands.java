/*
note--> grid[0].length: This gives you the length of the first row, which is the number of columns in the matrix.

Correct Order of Conditions
The condition should first ensure the indices are within bounds before accessing the matrix and checking the content:


*/
class Solution 
{
    public int numIslands(char[][] grid) 
    
    {
        int c=0;
        for(int i=0;i<grid.length;i++)
        {
           for(int j=0;j<grid[i].length;j++)
           {
                if(grid[i][j]=='1')
                {
                    c++;
                    DFS(grid,i,j);
                }

           }
        }
        return c;
    }

    public void DFS(char[][]grid,int i,int j)
    {
       if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0')
       {
        return;
       }
       grid[i][j]='0';
       DFS(grid,i,j+1);
       DFS(grid,i,j-1);
       DFS(grid,i+1,j);
       DFS(grid,i-1,j);
    }


}

