class Solution {
    public int strStr(String haystack, String needle) {
        int count=0;
        int ptr=0;
        int i=0;
        while(i<haystack.length()){
            if(haystack.charAt(i)==needle.charAt(ptr)){
                i++;
                ptr++;
                if(ptr==needle.length()){
                    return i-ptr;
                }
            }
            else{
                i=count;
                count++;
                ptr=0;
            }
        }

        return -1;
        
    }
}