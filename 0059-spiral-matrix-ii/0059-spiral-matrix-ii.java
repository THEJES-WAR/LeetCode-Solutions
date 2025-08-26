class Solution {
    public int[][] generateMatrix(int n) {
        int [][] matrix = new int[n][n];
        int c = 1;
        int left = 0,right = n-1,bottom = n-1,top = 0;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                matrix[top][i] = c++; 
            }
            top++;
            for(int i=top;i<=bottom;i++){
                matrix[i][right] = c++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    matrix[bottom][i] = c++;
                }
            }
            bottom--;
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    matrix[i][left] = c++;
                }
            }
            left++;
        }
        return matrix;
    }
}