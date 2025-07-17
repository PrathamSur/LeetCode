class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newArr=merge(nums1,nums2);
        int n=newArr.length;
        if(n%2!=0){
            return (double)newArr[n/2];
        }
        return (double)(newArr[n/2]+newArr[(n/2)-1])/2;
    }

    public int[] merge(int[] arr1,int[] arr2){  
        int[] ans=new int[arr1.length+arr2.length] ;
        int i=0;
        int j=0;
        int count=0; //  a variable to keep count of the insertion in the new array
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[count]=arr1[i];
                count++;
                i++;
            }
            else{
                ans[count]=arr2[j];
                count++;
                j++;
            }
        }
        while(j<arr2.length){
            ans[count]=arr2[j];
            count++;
            j++;
        }
        while(i<arr1.length){
            ans[count]=arr1[i];    // first hard problem solved in first try
            count++;
            i++;
        }
        return ans;
    }
}