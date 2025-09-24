class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();

        for (int n : nums1) s1.add(n);
        for (int n : nums2) {
            if (s1.contains(n)) {
                s2.add(n);
            }
        }

        int[] ans = new int[s2.size()];
        int i = 0;
        for (int n : s2) ans[i++] = n;
        return ans;
    }
}