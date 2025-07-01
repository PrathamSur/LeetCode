class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int low=1;
        int high=maxVal(piles);
        int ans=high;
        while(low<=high){
            int mid=(low+high)/2;
            int f=findHrs(piles,mid);
            if(f<=h){
                high=mid-1;
                ans=Math.min(ans,mid);
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int findHrs(int[] arr,int m){  // a method to find how many hors will it take total to eat all the bananas
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans+=Math.ceil((double)arr[i]/m);
        }   
        return ans;
    }
    public int maxVal(int[] arr){
        int max=0;
        for(int i:arr){
            max=Math.max(max,i);
        }
        return max;
    }
}