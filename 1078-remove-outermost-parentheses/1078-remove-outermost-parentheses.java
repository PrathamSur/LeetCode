class Solution {
    public String removeOuterParentheses(String s) {
        StringBuffer ans=new StringBuffer();
        int depth=0;

        for(char i:s.toCharArray()){
            if(i=='('){
                if(depth>0){
                    ans.append(i);
                }
                depth++;
            }
            else{
                depth--;
                if(depth>0){
                    ans.append(i);
                    
                }
            }
        }
        return ans.toString();
    }
}