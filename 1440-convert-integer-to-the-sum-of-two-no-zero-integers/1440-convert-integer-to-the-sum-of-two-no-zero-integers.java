class Solution {
    
    public int[] getNoZeroIntegers(int n) {
        // Iterate through all possible values for the first integer, 'a'.
        for (int a = 1; a < n; a++) {
            int b = n - a;
            
            // If neither 'a' nor 'b' contains a zero, we've found our solution.
            if (!containsZero(a) && !containsZero(b)) {
                return new int[]{a, b};
            }
        }
        
        // This part is unreachable based on the problem's guarantee that a solution always exists,
        // but it's required for the method to compile.
        return new int[]{}; 
    }

    
    private boolean containsZero(int num) {
        // The simplest way to check is to convert the number to a string.
        return String.valueOf(num).contains("0");
    }
}