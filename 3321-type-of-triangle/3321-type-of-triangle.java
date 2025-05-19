class Solution {
    public String triangleType(int[] nums) {
        String iso="isosceles";
        String equi="equilateral";
        String scal="scalene";


        if(nums[0]+nums[1]>nums[2] && nums[1]+nums[2]>nums[0] && nums[0]+nums[2]>nums[1]){
            if(nums[0]==nums[1] && nums[1]==nums[2]) return equi;
            else if(nums[0]==nums[1] || nums[1]==nums[2] || nums[0]==nums[2]) return iso;
            else return scal;
            
        }
        else return "none";
        
    }
}