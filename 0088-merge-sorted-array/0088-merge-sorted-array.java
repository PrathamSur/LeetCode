class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        if(nums1.length==0 || nums2.length==0) return;
        while(i<m){
            i++;
        }
        for(int j=0;j<n;j++){
            nums1[i]=nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}