class Solution { 
    public static void dfs(int node,ArrayList<ArrayList<Integer>> lst,boolean[] isVisited){
        isVisited[node]=true;

        for(Integer x:lst.get(node)){
            if(!isVisited[x]){
                dfs(x,lst,isVisited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        ArrayList<ArrayList<Integer>> lst=new ArrayList<>();
        for(int i=0;i<n;i++){
            lst.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && i!=j){
                    lst.get(i).add(j);
                    lst.get(j).add(i);
                }
            }
        }
        int count=0;
        boolean[] isVisited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!isVisited[i]){
                count++;
                dfs(i,lst,isVisited);
            }
        }
        return count;
    }
}
