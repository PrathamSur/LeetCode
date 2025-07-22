class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        if(nums.length==0) return 0;
        
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        int max=0;
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(!set.contains(nums[j])){
                set.add(nums[j]);
                sum+=nums[j];
            }
            else{
                while(nums[i]!=nums[j]){
                    sum-=nums[i];
                    set.remove(nums[i]);
                    i++;
                }
                i++;
            }
            max=Math.max(max,sum);
        }
        return max;

    }
}