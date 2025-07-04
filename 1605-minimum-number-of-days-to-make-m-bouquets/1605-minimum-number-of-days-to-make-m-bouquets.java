class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<(long)m*k) return -1;
        int low=min(bloomDay);
        int high=max(bloomDay);
        int ans=high;
        while(low<=high){
            int mid=(low+high)/2;

            if(possible(bloomDay,mid,m,k)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;

    }

    public boolean possible(int[] arr,int day,int m,int k){ //the method that will return if with a given day it is possible to make the bouquets or not
        int count=0;
        int noOfB=0;
        for(int i:arr){
            if(i<=day){
                count++;
                if(count==k){
                    noOfB++;
                    count=0;
                }
            }
            else{
                count=0;
            } 
            
        }
        
        if(noOfB>=m) return true;
        else return false;
    }

    public int max(int[] arr){
        int max=0;
        for(int i:arr){
            max=Math.max(max,i);
        }
        return max;
    }

    public int min(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i:arr){
            min=Math.min(min,i);
        }
        return min;
    }
}