class Solution
 {
    public int equalPairs(int[][] grid)
    {
        
        int n = grid.length;
        int count = 0;

        // Transpose the matrix
        int[][] transpose = new int[n][n];

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                transpose[i][j] = grid[j][i];
            }
        }

// Compare each row of the original matrix with each row of the transposed matrix
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (Arrays.equals(grid[i], transpose[j])) 
                {
                    count++;
                }
            }
        }

        return count;

        
    }
}