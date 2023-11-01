class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0) return false;
        return subsetSum(nums,sum/2,nums.length);
    }
    static Boolean subsetSum(int[] arr,int sum,int N){
        boolean[][] dp=new boolean[N+1][sum+1];
        for(int i=0;i<sum+1;i++) dp[0][i]=false;
        for(int i=0;i<N+1;i++) dp[i][0]=true;
        for(int i=1;i<N+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1]<=j) dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j] ;
                else if(arr[i-1]>j) dp[i][j]=dp[i-1][j];
            }
        }
        return dp[N][sum]; 
    }
}
