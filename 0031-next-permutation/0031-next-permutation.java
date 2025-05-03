class Solution {
    public void nextPermutation(int[] nums) {
        int margin=0;
        int flag=0;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                margin=i;
                flag=1;
                break;
            }
        }
        for(int j=nums.length-1;j>margin;j--){
            if(nums[j]>nums[margin]){
                int temp=nums[j];
                nums[j]=nums[margin];
                nums[margin]=temp;
                break;
            }
        }
        int a=margin+1;
        if(flag==0)
            a=margin;
           
        int b=nums.length-1;
        while(a<b){
            int temp=nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
            a++;
            b--;
        }
    }
}