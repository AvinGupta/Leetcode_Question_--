class Solution {
    public static void rotate(int[][] arr) {
        int len=arr.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            int spt=0;
            int ept=arr.length-1;
            while(spt<=ept){
                int temp=arr[i][spt];
                arr[i][spt]=arr[i][ept];
                arr[i][ept]=temp;
                spt++;
                ept--;
            }
                
        }
    }
}
