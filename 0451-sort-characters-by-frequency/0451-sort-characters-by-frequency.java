class Solution {
    public String frequencySort(String s) {
        int[] freq=new int[128];

        for(char i:s.toCharArray()){
            freq[i]++;
        }

        StringBuilder st=new StringBuilder();
        int remaining = s.length();

        while (remaining > 0) {
            int maxFreq = 0;
            char maxChar = 0;
            for (int i = 0; i < 128; i++) {
                if (freq[i] > maxFreq) {
                    maxFreq = freq[i];
                    maxChar = (char)i;
                }
            }
            for (int i = 0; i < maxFreq; i++) {
                st.append(maxChar);
            }
            freq[maxChar] = 0;

            remaining -= maxFreq;
        }

        return st.toString();
    }
}