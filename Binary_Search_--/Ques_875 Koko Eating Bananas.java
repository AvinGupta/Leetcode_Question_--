class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int spt=1;
        int ept=0;
        for(int var:piles) ept=Math.max(ept,var);
        int ans=Integer.MAX_VALUE;
        while(spt<=ept){
            int mid=spt+(ept-spt)/2;
            int val=totalHours(piles,mid);
            if(val<=h){
                ans=mid;
                ept=mid-1;
            }
            else spt=mid+1;
        }
        return ans;
    }
    public static int totalHours(int[] arr,int hrs){
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=Math.ceil((double)arr[i]/(double)hrs);
        }
        return total;
    }
}
