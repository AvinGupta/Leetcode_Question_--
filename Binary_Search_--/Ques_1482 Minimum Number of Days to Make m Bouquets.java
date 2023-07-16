class Solution {
    
    public int minDays(int[] bloomDay, int m, int k) {
        int spt=Integer.MAX_VALUE;
        int ept=Integer.MIN_VALUE;
        for(int var:bloomDay){
            if(var<spt) spt=var;
            if(var>ept) ept=var;
        }
        int ans=-1;
        while(spt<=ept){
            int mid=spt+(ept-spt)/2;
            if(isPosb(bloomDay,mid,m,k)){
                ans=mid;
                ept=mid-1;
            }
            else{
                spt=mid+1;
            }
        }
        return ans;
    }
    public static boolean isPosb(int[] arr,int day,int m,int k){
        int cnt=0;
        int total=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                cnt++;
            }
            else{
                total+=(cnt/k);
                cnt=0;
            }
        }
        total+=(cnt/k);
        return total>=m;
    }
}
