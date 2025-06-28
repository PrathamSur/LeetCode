class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int mid=(low+high)/2;
        int ans=Integer.MAX_VALUE;

        while(low<=high){
            if(nums[low]<=nums[mid]){    //left half sorted
                ans=Math.min(nums[low],ans);
                low=mid+1;
                
            }
            else{       //if right half is sorted
                ans=Math.min(nums[mid],ans);
                high=mid-1;
                
            }
            mid=(low+high)/2;
        }
        return ans;
    }
}