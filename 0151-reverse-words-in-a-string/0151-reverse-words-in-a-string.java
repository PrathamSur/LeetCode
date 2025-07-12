class Solution {
    public String reverseWords(String s) {
        // Trimming  and spliting by one or more spaces
        String[] str = s.trim().split("\\s+");

        StringBuilder out = new StringBuilder();

        // Appending words in reverse order
        for (int i = str.length - 1; i >= 0; i--) {
            out.append(str[i]);
            if (i > 0) out.append(" ");
        }

        return out.toString();
    }
}
