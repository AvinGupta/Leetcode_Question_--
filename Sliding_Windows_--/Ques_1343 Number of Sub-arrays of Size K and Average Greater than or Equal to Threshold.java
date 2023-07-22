class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int spt=0;
        int ept=0;
        int cnt=0;
        int sum=0;
        while(ept<arr.length){
            sum+=arr[ept];
            if(ept-spt+1<k) ept++;
            else if(ept-spt+1==k){
                if(sum/k>=threshold) cnt++;
                sum-=arr[spt];
                ept++;
                spt++;
            }
        }
        return cnt;
        
    }
}
