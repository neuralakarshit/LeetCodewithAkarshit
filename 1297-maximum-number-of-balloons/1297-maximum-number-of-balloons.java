class Solution 
{
    public int maxNumberOfBalloons(String text)
    {
        // Create a HashMap to store the frequency of the characters
        HashMap<Character, Integer> countMap = new HashMap<>();

        // Count the frequency of each character in the input string
        for (char c : text.toCharArray()) {
            if (c == 'b' || c == 'a' || c == 'l' || c == 'o' || c == 'n') {
                countMap.put(c, countMap.getOrDefault(c, 0) + 1);
            }
        }

        // Adjust the counts for 'l' and 'o' (which appear twice in "balloon")
        countMap.put('l', countMap.getOrDefault('l', 0) / 2);
        countMap.put('o', countMap.getOrDefault('o', 0) / 2);

        // Find the minimum count among 'b', 'a', 'l', 'o', 'n'
return Math.min(Math.min(countMap.getOrDefault('b', 0), countMap.getOrDefault('a', 0)),Math.min(countMap.getOrDefault('l', 0), Math.min(countMap.getOrDefault('o', 0), countMap.getOrDefault('n', 0))));
    
    
    }
}