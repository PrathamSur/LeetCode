class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        findSubsets(nums,0,new ArrayList<>(),ans);
        return ans;
    }

    public void findSubsets(int[] nums,int index, List<Integer>temp, List<List<Integer>> ans){
        ans.add(new ArrayList<>(temp));
        for(int i=index;i<nums.length;i++){
            if(i!=index && nums[i]==nums[i-1]) continue;
            temp.add(nums[i]);
            findSubsets(nums,i+1,temp, ans);
            temp.remove(temp.size()-1);
        }

    }
}