class pair{
    int row;
    int col;
    int time;
    public pair(int row,int col,int time){
        this.row=row;
        this.col=col;
        this.time=time;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int count=0;
        Queue<pair> q=new LinkedList<>();
        int[][] isVisited=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    isVisited[i][j]=2;
                    q.add(new pair(i,j,0));
                }
                else{
                    isVisited[i][j]=0;
                }
                if(grid[i][j]==1){
                    count++;
                }
            }
        }

        int cnt=0;
        int time=0;
        int[] rw={-1,0,1,0};
        int[] cl={0,1,0,-1};
        while(!q.isEmpty()){
            int row=q.peek().row;
            int col=q.peek().col;
            int tm=q.peek().time;
            q.remove();
            time=Math.max(time,tm);

            for(int i=0;i<rw.length;i++){
                int nrow=row+rw[i];
                int ncol=col+cl[i];
                if(nrow>=0 && ncol>=0 && nrow<n && ncol<m && grid[nrow][ncol]==1 && isVisited[nrow][ncol]==0){
                    isVisited[nrow][ncol]=2;
                    q.add(new pair(nrow,ncol,tm+1));
                    cnt++;
                }
            }
        }
        if(count!=cnt) return -1;
        return time;
    }
}
