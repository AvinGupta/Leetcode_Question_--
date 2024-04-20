class Solution { 
    public int countNegatives(int[][] grid) {
        int cnt=0;
        for(int i=0;i<grid.length;i++){
          cnt+=Neg_cnt(grid[i]);
        }
        return cnt;
        
    }
    public int Neg_cnt(int arr[]){
      int spt=0;
      int ept=arr.length;
      while(spt<ept){
        int mid=spt+(ept-spt)/2;
        if(arr[mid]<0)ept=mid;
        else spt=mid+1;
      }
      return arr.length-spt;
    }
}
