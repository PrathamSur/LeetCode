class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int r=0;
        int size=0;
        int maxSize=0;
        int zero=0;
        while(r<nums.length){
            if(nums[r]==0){
                zero++;
            }
            while(zero>k){
                if(nums[l]==0){
                    l++;
                    zero--;
                }
                else{
                    l++;
                }
            }
            if(zero<=k){
                size=r-l+1;
                maxSize=Math.max(size,maxSize);
            }
            r++;
        }
        return maxSize;
    }
}