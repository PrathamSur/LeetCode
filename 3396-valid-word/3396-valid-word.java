class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        int vow=0;
        int cons=0;
        
        for(char i:word.toCharArray()){
            if (Character.isLetterOrDigit(i)) {
                if(isVowel(i)) vow++;
                else if(!Character.isDigit(i)){
                    cons++;
                }
            }
            else{
                return false;
            }
        }
        return (cons>0 && vow>0);
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c); // make it case-insensitive
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}