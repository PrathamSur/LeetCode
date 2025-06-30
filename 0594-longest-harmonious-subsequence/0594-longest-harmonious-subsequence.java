class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int maxLen = 0;

        for (int end = 0; end < nums.length; end++) {
            // Shrink the window until the difference is at most 1
            while (nums[end] - nums[start] > 1) {
                start++;
            }
            // If the difference is exactly 1, update max length
            if (nums[end] - nums[start] == 1) {
                maxLen = Math.max(maxLen, end - start + 1);
            }
        }

        return maxLen;
    }
}