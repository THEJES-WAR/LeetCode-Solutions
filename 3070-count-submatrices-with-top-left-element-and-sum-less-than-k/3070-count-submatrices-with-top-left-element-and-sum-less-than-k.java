class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int c = 0;
        int ps = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i != 0) {
                    ps = grid[i - 1][j];
                    if(j!=0){
                        ps+= grid[i][j-1] - grid[i-1][j-1];
                    }
                }
                ps += grid[i][j];
                grid[i][j] = ps;
                if(grid[i][j]<=k) c++;
            }
        }
        return c;
    }
}