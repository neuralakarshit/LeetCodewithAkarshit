class Solution 
{
    public boolean judgeCircle(String moves) 
    {
        
        int x = 0, y = 0; // Initial position at the origin (0, 0)
        
        // Iterate through each move using a normal for loop
        for (int i = 0; i < moves.length(); i++) 
        {
            char move = moves.charAt(i); // Get the current move
            
            if (move == 'U') 
            {
                y++; // Move up
            } 
            else if (move == 'D') 
            {
                y--; // Move down
            } 
            else if (move == 'L')
            {
                x--; // Move left
            } 
            else if (move == 'R') 
            {
                x++; // Move right
            }
        }
        
        // Check if the final position is back at the origin
        return x == 0 && y == 0;


    }
}