class Solution 
{
    public void setZeroes(int[][] matrix) 
    {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Step 1: Determine if the first row or first column needs to be zeroed
        for (int i = 0; i < m; i++) 
        {
            if (matrix[i][0] == 0) 
            {
                firstColZero = true;
                break;
            }
        }

        for (int j = 0; j < n; j++) 
        {
            if (matrix[0][j] == 0) 
            {
                firstRowZero = true;
                break;
            }
        }

        // Step 2: Use the first row and column to mark zeroes for other rows and columns
        for (int i = 1; i < m; i++) 
        {
            for (int j = 1; j < n; j++) 
            {
                if (matrix[i][j] == 0) 
                {
                    matrix[i][0] = 0;  // Mark the row
                    matrix[0][j] = 0;  // Mark the column
                }
            }
        }

        // Step 3: Zero out rows based on markers in the first column
        for (int i = 1; i < m; i++) 
        {
            if (matrix[i][0] == 0) 
            {
                for (int j = 1; j < n; j++) 
                {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 4: Zero out columns based on markers in the first row
        for (int j = 1; j < n; j++) 
        {
            if (matrix[0][j] == 0) 
            {
                for (int i = 1; i < m; i++) 
                {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 5: Zero out the first row if needed
        if (firstRowZero) 
        {
            for (int j = 0; j < n; j++) 
            {
                matrix[0][j] = 0;
            }
        }

        // Step 6: Zero out the first column if needed
        if (firstColZero)
         {
            for (int i = 0; i < m; i++) 
            {
                matrix[i][0] = 0;
            }
        }
    }
}
