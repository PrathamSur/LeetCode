class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int n=nums.length;
        if(n==1) return nums[0];
        int low=1;
        int high=n-2;

        if(nums[low]!=nums[low-1]) return nums[low-1];
        if(nums[high]!=nums[high+1]) return nums[high+1];

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];
            if((nums[mid]==nums[mid-1] && mid%2!=0) || (nums[mid]==nums[mid+1] && mid%2==0)){
                low=mid+1;
            }
            else {
                high=mid-1;
            }

        }
        return -1;
    }
}