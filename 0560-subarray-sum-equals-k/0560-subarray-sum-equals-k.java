class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> store=new HashMap<>();

        int preSum=0;
        int cnt=0;

        store.put(0,1);
        for(int i:nums){
            preSum+=i;
            cnt+=store.getOrDefault(preSum-k,0);
            store.put(preSum,store.getOrDefault(preSum,0)+1);
        }
        return cnt;
    }
}
