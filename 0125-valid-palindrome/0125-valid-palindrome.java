class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        return isPal(cleaned);
    }

    public boolean isPal(String s){
        if(s.length()>1){
            if(s.charAt(0)==s.charAt(s.length()-1)){
               return  isPal(s.substring(1,s.length()-1));
            } 
                
            else{
                return false;
            }

        }
        return true;
    }
}