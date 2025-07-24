class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder result = new StringBuilder();
        int gap = 2 * (numRows - 1); // correct full cycle

        for (int row = 0; row < numRows; row++) {
            int j = row;
            boolean toggle = true; // to alternate between jumps

            int down = gap - 2 * row;
            int up = 2 * row;

            if (down == 0) down = up;  // for first or last row
            if (up == 0) up = down;

            while (j < s.length()) {
                result.append(s.charAt(j));
                j += toggle ? down : up;
                toggle = !toggle;
            }
        }

        return result.toString();
    }
}
