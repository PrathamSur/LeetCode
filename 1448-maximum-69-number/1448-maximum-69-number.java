class Solution {
    public int maximum69Number (int num) {
        String st=Integer.toString(num);
        int ans=0;
        int flag=0;
        for(char i:st.toCharArray()){
            if(i=='9') ans=(ans*10)+9;
            else{
                if(flag==0){
                    ans=(ans*10)+9;
                    flag=1;
                    continue;
                }
                ans=(ans*10)+6;   
            }
        }
        return ans;


    }
}