class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int spt=1;
        int ept=0;
        for(int var:nums){
            if(var>ept) ept=var;
        }
        int ans=0;
        while(spt<=ept){
            int mid=spt+(ept-spt)/2;
            if(posbAns(nums,threshold,mid)){
                ans=mid;
                ept=mid-1;
            }
            else spt=mid+1;
        }
        return ans;
    }
    public static boolean posbAns(int[] arr,int thres,int div){
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=Math.ceil((double)arr[i]/(double)div);
        }
        return total<=thres;
    }
}
