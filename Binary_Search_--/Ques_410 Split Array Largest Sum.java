class Solution { 
    public int splitArray(int[] nums, int k) {
        int spt=0;
        int ept=0;
        for(int var:nums){
            if(var>spt) spt=var;
            ept+=var;
        }
        int ans=0;
        while(spt<=ept){
            int mid=spt+(ept-spt)/2;
            if(isPosb(nums,mid,k)){
                ans=mid;
                ept=mid-1;
            }
            else spt=mid+1;
        }
        return ans;
    }
    public static boolean isPosb(int[] arr,int mid,int k){
        int var=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]<=mid){
                sum+=arr[i];
            }
            else{
                var++;
                sum=arr[i];
            }
            if(var>k) return false;
        }
        return true;
    }
}
