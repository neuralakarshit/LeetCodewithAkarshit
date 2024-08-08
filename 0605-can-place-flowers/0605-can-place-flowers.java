class Solution 
{
    public boolean canPlaceFlowers(int[] flowerbed, int n) 
    {
        int c = 0; // Number of flowers we can plant
        int N = flowerbed.length;

        // Handle edge cases
        if (n == 0) 
        {
            return true;
        }
        if (n > N) 
        {
            return false;
        }
        if (N == 1) 
        {
            return flowerbed[0] == 0 && n == 1;
        }

        // Check the first plot
        if (flowerbed[0] == 0 && flowerbed[1] == 0) 
        {
            flowerbed[0] = 1;
            flowerbed[0]=1;
            c++;
        }

        // Check the last plot
        if (flowerbed[N - 1] == 0 && flowerbed[N - 2] == 0)
        {
            flowerbed[N - 1] = 1;
            flowerbed[N-1]=1;
            c++;
        }

        // Check the middle plots
        for (int i = 1; i < N - 1; i++) 
        {
            if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) 
            {
                flowerbed[i] = 1;
                c++;
                i++; // Skip the next plot to avoid overlapping
            }
        }

        return c >= n;
    }
}