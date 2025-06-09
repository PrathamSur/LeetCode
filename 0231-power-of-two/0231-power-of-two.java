class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1)return true;
        for(int i=0;i<n;i++){
            if(Math.pow(2,i)==n) return true;
            else if(Math.pow(2,i)>n/2) return false;
            
        }
        return false;
    }
}