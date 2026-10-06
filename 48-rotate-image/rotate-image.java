class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int arr[][]=new int[n][n];
        for(int i=0;i<n-1;i++){
           for(int j=i+1;j<n;j++){
            swap(matrix,i,j,j,i);
           }
        }
        
         for(int i=0;i<n;i++){
          reverse(matrix,i);
           }
        }
    
    void swap(int[][] matrix, int r1, int c1, int r2, int c2){
         int temp=matrix[r1][c1];
         matrix[r1][c1]=matrix[r2][c2];
         matrix[r2][c2]=temp;
    }
    void reverse(int[][] matrix, int row){
        int left=0;
        int right=matrix.length-1;
        while(left<=right){
        swap(matrix,row,left,row,right);
        left++;
        right--;
        }
    }
    }