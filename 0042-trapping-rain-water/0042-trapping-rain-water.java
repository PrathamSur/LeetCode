class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] prefix=new int[n];
        int[] suffix=new int[n];
        int ans=0;
        prefix[0]=height[0];
        suffix[n-1]=height[n-1];

        // for the prefix
        for(int i=1;i<n;i++){
            prefix[i]=Math.max(prefix[i-1],height[i]);
        }
        //for the suffix array
        for(int i=n-2;i>=0;i--){
            suffix[i]=Math.max(suffix[i+1],height[i]);
        }
        //now traverse and add
        for(int i=1;i<n-1;i++){
            ans+=Math.min(prefix[i],suffix[i])-height[i];
        }
        return ans;
    }
}