class Solution{
    public int minDistance(String x, String y) {
        int m=x.length();
        int n=y.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<m+1;i++) dp[i][0]=i;
        for(int i=0;i<n+1;i++) dp[0][i]=i;
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                }
            }
        }
        return dp[m][n];
    }
}
