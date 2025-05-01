class Solution {
    public boolean checkValidString(String s) {
        int min=0;
        int max=0;
        for(char i:s.toCharArray()){
            if(i=='('){
                min++;
                max++;
            }
            if(i==')'){
                min--;
                max--;
            }
            else if(i=='*'){
                min-=1;
                max+=1;
            }
            if(min<0) min=0;
            if(max<0) return false;
        }
        return (min==0);
    }
}