class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int high=n-1;
        int low=0;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[low]==target) return true;
            if(nums[high]==target) return true;
            if(nums[mid]==target) return true;
            
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low++;
                high--;
                continue;
            }
            if(nums[low]<=nums[mid]){
                if(target<nums[mid] && target>nums[low]){
                    low++;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                    high--;
                }
            }
            else{
                if(target>nums[mid] && target<nums[high]){
                    low=mid+1;
                    high--;
                }
                else{
                    low++;
                    high=mid-1;
                }
            }

        }
        return false;
    }
}