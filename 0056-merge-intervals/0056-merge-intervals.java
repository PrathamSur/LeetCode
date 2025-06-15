class Solution {
    public int[][] merge(int[][] intervals) {
         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
         int n=intervals.length;

         List<int[]> ans=new ArrayList<>();

         for(int[] i:intervals){
            if(ans.isEmpty() || i[0]>ans.get(ans.size()-1)[1]){
                ans.add(i);
            }
            else{
                ans.get(ans.size()-1)[1]=Math.max(i[1],ans.get(ans.size()-1)[1]);
            }
         }
         return ans.toArray(new int[ans.size()-1][]);
    }
}