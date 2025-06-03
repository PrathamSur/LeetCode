class Solution {
    public boolean isArraySpecial(int[] nums) {
        int l=nums.length;
        if(l==1) return true;
        int i=0;
        while(i<l-1){
            if(nums[i]%2==0){
                if(nums[i+1]%2!=0) i++;
                else return false;
            }
            else{
                if(nums[i+1]%2==0) i++;
                else return false;
            }

        }
        return true;
    }
}