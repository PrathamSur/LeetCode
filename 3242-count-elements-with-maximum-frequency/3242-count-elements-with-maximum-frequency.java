class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        int max=0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            max = Math.max(max, map.get(num));
        }
        
        for(Integer i:map.values()){
            if(i==max){
                ans+=i;
            }
        }
        return ans;
    }
}