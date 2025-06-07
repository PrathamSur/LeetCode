class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result=new int[2];
        int flag=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                result[0]=i;
                flag=1;
                break;
            }
            
        }
        if(flag!=1){
            result[0]=-1;
            result[1]=-1;
            return result;
        }
        for(int j=result[0]+1;j<nums.length;j++){
            if(nums[j]!=target){
                result[1]=j-1;
                flag=2;
                break;
            }

        }
        if(flag==1){
           result[1]=nums.length-1; 
        }
        return result;
    }
}