class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total = 0;
        
        // take first k cards from left
        for (int i = 0; i < k; i++) {
            total += cardPoints[i];
        }
        
        int max = total;
        
        // now try replacing left cards with right cards one by one
        for (int i = 1; i <= k; i++) {
            total = total - cardPoints[k - i] + cardPoints[n - i];
            max = Math.max(max, total);
        }
        
        return max;
    }
}
