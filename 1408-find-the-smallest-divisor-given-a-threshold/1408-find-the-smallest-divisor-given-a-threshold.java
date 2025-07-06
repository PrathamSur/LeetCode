class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int high=max(nums);
        int low=1;
        int ans=high;

        while(low<=high){
            int mid=(high+low)/2;
            if(possible(nums,threshold,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean possible(int[] arr,int threshold,int day){
        int sum=0;
        for(int i:arr){
            sum+=(int)Math.ceil((double)i/day);
        }
        return (sum<=threshold);
    }

    public int max(int[] arr){
        int max=0;
        for(int i:arr){
            max=Math.max(max,i);
        }
        return max;
    }
}