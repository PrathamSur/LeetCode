class Solution {
    public int possibleStringCount(String word) {
        int count=0;
        int ans=0;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)==word.charAt(i-1)){  
                count++;
            }
            else{
                ans+=count;
                count=0;
            }
        }
        ans+=count;
        return ans+1;
    }
}