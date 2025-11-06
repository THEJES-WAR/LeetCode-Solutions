class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid=new int[m][n];
        for(int[] g:guards){
            grid[g[0]][g[1]]=1;
        }
        for(int[] w:walls){
            grid[w[0]][w[1]]=-1;
        }
        for(int i=0;i<guards.length;i++){
            int x=guards[i][0];
            int y=guards[i][1];
            for(int u=x-1;u>=0;u--){
                if(grid[u][y]==1||grid[u][y]==-1) break;
                grid[u][y]=2;
            }
            for(int d=x+1;d<m;d++){
                if(grid[d][y]==1||grid[d][y]==-1) break;
                grid[d][y]=2;
            }
            for(int l=y-1;l>=0;l--){
                if(grid[x][l]==1||grid[x][l]==-1) break;
                grid[x][l]=2;
            }
            for(int r=y+1;r<n;r++){
                if(grid[x][r]==1||grid[x][r]==-1) break;
                grid[x][r]=2;
            }
        }
        int count=0;
        for(int[] c:grid){
            for(int r:c){
                if(r==0) count++;
            }
        }
        return count;
    }
}