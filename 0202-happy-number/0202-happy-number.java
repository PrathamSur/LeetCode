class Solution {
    public boolean isHappy(int n) {
        int sum=sqrDig(n);
        int cnt=0;
        while(sum!=1){
            sum=sqrDig(sum);
            cnt++;
            if(cnt==10) return false;
        }
        return true;
    }

    public int sqrDig(int n){
        int sum=0;
        while(n>0){
            
            int i=n%10;
            sum+=i*i;
            n=n/10;
        }
        return sum;
    }
        
}