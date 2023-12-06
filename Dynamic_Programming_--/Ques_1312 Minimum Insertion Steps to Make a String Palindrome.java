class Solution {
    public int minInsertions(String x) {
        StringBuilder sb=new StringBuilder(x);
        String y=sb.reverse().toString();
        int m=x.length();
        int n=y.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<m+1;i++) dp[i][0]=0;
        for(int i=0;i<n+1;i++) dp[0][i]=0;
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return x.length()-dp[m][n];
    }
}
