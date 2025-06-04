class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        int i=m;
        while(m<nums1.length && j<n){
            nums1[i]=nums2[j];
            i++;
            j++;
        }
        Arrays.sort(nums1);
        

        
    }
}