class pair{
    int first;
    int second;
    public pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public static void bfs(int row,int col,char[][] grid,boolean[][] isVisited){
        int n=grid.length;
        int m=grid[0].length;

        Queue<pair> q=new LinkedList<>();
        q.add(new pair(row,col));
        
        while(!q.isEmpty()){
            int rw=q.peek().first;
            int cl=q.peek().second;
            q.remove();

            int[] drow={-1,0,1,0};
            int[] dcol={0,1,0,-1};
            for(int i=0;i<drow.length;i++){
                int nrow=rw+drow[i];
                int ncol=cl+dcol[i];
                if(nrow>=0 && ncol>=0 && nrow<n && ncol<m && grid[nrow][ncol]=='1' && !isVisited[nrow][ncol]){
                    isVisited[nrow][ncol]=true;
                    q.add(new pair(nrow,ncol));
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        boolean[][] isVisited=new boolean[n][m];
        int count=0;
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                if(grid[row][col]=='1' && !isVisited[row][col]){
                    count++;
                    bfs(row,col,grid,isVisited);
                }
            }
        }
        return count;
    }
}
