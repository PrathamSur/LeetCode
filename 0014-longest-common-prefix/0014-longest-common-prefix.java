class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        StringBuilder arr=new StringBuilder();
        Arrays.sort(strs);

        String first=strs[0];
        String last=strs[strs.length-1];

        for(int i=0;i<first.length();i++){
            if(first.charAt(i)==last.charAt(i)){
                arr.append(first.charAt(i));
            }
            else{
                String res=arr.toString();
                return res;
            }
        }
        return arr.toString();
        
    }
        
}