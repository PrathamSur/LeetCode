class Solution {
    private String remain; // to store the remaining string after first pattern removal

    public int maximumGain(String s, int x, int y) {
        int sum = 0;

        if (x > y) {
            // Remove "ab" first, then "ba"
            sum += removePattern(s, 'a', 'b', x);
            sum += removePattern(remain, 'b', 'a', y);
        } else {
            // Remove "ba" first, then "ab"
            sum += removePattern(s, 'b', 'a', y);
            sum += removePattern(remain, 'a', 'b', x);
        }

        return sum;
    }

    private int removePattern(String s, char first, char second, int points) {
        StringBuilder sb = new StringBuilder();
        int gain = 0;

        for (char ch : s.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == first && ch == second) {
                sb.deleteCharAt(sb.length() - 1);
                gain += points;
            } else {
                sb.append(ch);
            }
        }

        remain = sb.toString(); // update leftover string for next round
        return gain;
    }
}
