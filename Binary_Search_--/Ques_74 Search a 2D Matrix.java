//by assuming 2d array as 1d array.
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int spt=0;
        int ept=n*m-1;
        while(spt<=ept){
            int mid=spt+(ept-spt)/2;
            if(matrix[mid/m][mid%m]==target) return true;
            else if(matrix[mid/m][mid%m]>target) ept=mid-1;
            else spt=mid+1;
        }
        return false;
    }
}
//by shrinking the search space.
class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int row=0;
        int col=arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==target){
                return true;
            }
            else if(arr[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}
