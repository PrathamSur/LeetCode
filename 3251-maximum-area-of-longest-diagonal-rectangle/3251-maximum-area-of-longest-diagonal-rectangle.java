class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagSq = 0;  // store squared diagonal
        int maxArea = 0;

        for (int[] rect : dimensions) {
            int a = rect[0], b = rect[1];
            int diagSq = a * a + b * b; // diagonal squared
            int area = a * b;

            if (diagSq > maxDiagSq || (diagSq == maxDiagSq && area > maxArea)) {
                maxDiagSq = diagSq;
                maxArea = area;
            }
        }
        return maxArea;
    }
}
