class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        int rem=numBottles;
        while(rem>=numExchange){
            int newBottles=rem/numExchange;   
            ans+=newBottles;                    
            rem=newBottles+(rem%numExchange);
        }
        
        return ans;
    }
}