class Solution {
    public int countPrimes(int n) {
        if(n<2) return 0;
        int[] arr=new int[n];
        for(int i=2;i*i<n;i++){ 
            if(arr[i]==0){
                for(int mul=2;mul*i<n;mul++){
                    arr[i*mul]=1;
                }
            }
        }
        int cnt=0;
        for(int i=2;i<n;i++){
            if(arr[i]==0) cnt++;
        }
        return cnt;
    }
}
