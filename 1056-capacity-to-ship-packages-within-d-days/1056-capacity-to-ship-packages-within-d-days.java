class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=max(weights);
        int high=sum(weights);
        int ans=high;
        while(high>=low){
            int mid=(low+high)/2;       //her i am taking mid as the capacity
            if(totalDays(weights,mid)<=days){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public int totalDays(int[] arr,int capacity){
        int sum=0;
        int day=0;
        for(int i:arr){
            if(sum+i<=capacity){
                sum+=i;
            }
            else{
                sum=0;
                sum+=i;
                day++;
            }
        }
        return day+1;
    }

    public int sum(int[] arr){
        int s=0;
        for(int i:arr){
            s+=i;
        }
        return s;
    }

    public int max(int[] arr){////less go done in first try
                        
        int max=0;
        for(int i:arr){
            if(max<i) max=i;
        }
        return max;
    }
}