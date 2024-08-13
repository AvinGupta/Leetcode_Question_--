class Solution {
    public static int maxRow(int[][] mat,int mid){
        int ind=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<mat.length;i++){
            if(mat[i][mid]>max){
                max=mat[i][mid];
                ind=i;
            }
        }
        return ind;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int spt=0;
        int ept=mat[0].length-1;
        while(spt<=ept){
            int mid=spt+(ept-spt)/2;
            int max=maxRow(mat,mid);
            int left=mid-1>=0? mat[max][mid-1]:-1;
            int right=mid+1<m? mat[max][mid+1]:-1;
            if(mat[max][mid]>left && mat[max][mid]>right){
                return new int[]{max,mid};
            }
            else if(mat[max][mid]<left) ept=mid-1;
            else spt=mid+1;
        }
        return new int[]{-1,-1};
    }
}
