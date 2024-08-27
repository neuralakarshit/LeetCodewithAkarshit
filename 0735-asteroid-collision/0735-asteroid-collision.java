class Solution 
{
    public int[] asteroidCollision(int[] asteroids)
    {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            boolean destroyed = false;

            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (stack.peek() < -asteroid) {
                    stack.pop(); // The right-moving asteroid is smaller, so it's destroyed.
                    continue;
                } else if (stack.peek() == -asteroid) {
                    stack.pop(); // Both asteroids destroy each other.
                }
                destroyed = true;
                break;
            }

            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        // Convert the stack to an array
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
        
    }
}