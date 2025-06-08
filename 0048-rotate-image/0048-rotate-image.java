class Solution {
    public void rotate(int[][] matrix) {
        //lets do the transpose first
        int n=matrix.length;
        for(int i=0;i<n-1;i++){

            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            reverse(matrix[i]);
        }


    }

    public void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    
    void reverse(int[] arr) {
    int left = 0, right = arr.length - 1;
    while (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
}
}
