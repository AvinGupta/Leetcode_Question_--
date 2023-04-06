class Solution {
    public int getWinner(int[] arr, int k) {
        int maxWin=0;
        int  maxNum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<maxNum){
                maxWin++;
                if(maxWin==k) return maxNum;    
            }
            else{
                maxNum=arr[i];
                maxWin=1;
                if(maxWin==k) return maxNum;
            }
        }   
        return maxNum;
    }
}
