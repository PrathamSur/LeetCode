class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<String, Integer> countMap = new HashMap<>();
        int pairs = 0;

        for (int[] d : dominoes) {
            int a = Math.min(d[0], d[1]);
            int b = Math.max(d[0], d[1]);
            String key = a + "," + b;

            int count = countMap.getOrDefault(key, 0);
            pairs += count;
            countMap.put(key, count + 1);
        }

        return pairs;
    }
}