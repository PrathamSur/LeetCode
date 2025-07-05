class Solution {
    public int findLucky(int[] arr) {
        int[] count=new int[501];
        for(int i:arr){
            count[i]+=1;
        }
        for(int j=500;j>0;j--){
            if(count[j]==j) return j;
        }
        return -1;
    }
}