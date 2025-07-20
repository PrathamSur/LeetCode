class Solution {
    public int characterReplacement(String s, int k) {
        int[] hash= new int[26];
        int max=0;
        int maxf=0;
        int i=0;
        int j=0;
        while(j<s.length()){        // first move forward the right pointer
            hash[s.charAt(j)-'A']++;        // in the hash array ...increase the count of the letter 
            maxf=Math.max(maxf,hash[s.charAt(j)-'A']); // update max frequency each time while insertion
            if((j-i+1)-maxf>k){       // the condition is like this that even after changing k values nothing is happening, we do this
                hash[s.charAt(i)-'A']--;  // decrease the frequency of the left pointer
                i++;
            }else{
                max=Math.max(max,j-i+1);
            }
            j++;
            

        }
        return max;
    }
}