class Solution {
    public int findMin(int[] nums) {
        int spt=0;
        int ept=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(spt<=ept){
            int mid=spt+(ept-spt)/2;
            if(nums[mid]==nums[spt] && nums[mid]==nums[ept]){
                ans=Math.min(ans,nums[spt]);
                spt+=1;
                ept-=1;
                continue;
            }
            if(nums[spt]<=nums[mid]){
                ans=Math.min(ans,nums[spt]);
                spt=mid+1;
            }
            else{
                ans=Math.min(ans,nums[mid]);
                ept=mid-1;
            }
        }
        return ans;
    }
}
