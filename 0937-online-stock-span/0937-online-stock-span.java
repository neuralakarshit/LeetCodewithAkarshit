import java.util.Stack;

class StockSpanner {
    // Stack to store prices and their corresponding spans
    private Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;  // Initialize the span for the current price

        // Calculate the span by popping elements with prices less than or equal to the current price
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];  // Add the span of the popped price
        }
        
        // Push the current price and its span onto the stack
        stack.push(new int[]{price, span});
        
        return span;  // Return the span for the current price
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
