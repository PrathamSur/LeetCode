import java.util.HashSet;

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        // Put broken letters in a set for quick lookup
        HashSet<Character> broken = new HashSet<>();
        for (char c : brokenLetters.toCharArray()) {
            broken.add(c);
        }

        int ans = 0;
        // Split text into words
        String[] words = text.split(" ");

        for (String word : words) {
            boolean canType = true;
            for (char c : word.toCharArray()) {
                if (broken.contains(c)) {
                    canType = false;
                    break;
                }
            }
            if (canType) ans++;
        }

        return ans;
    }
}
