class Solution {
    public int searchInsert(int[] nums, int target) {
        int s_pt=0,e_pt=nums.length-1;
        while(s_pt<=e_pt){
            int mid=s_pt+(e_pt-s_pt)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]<target) s_pt=mid+1;
            else e_pt=mid-1;
        }
        return s_pt;
    }


    //method-2 using lower bound technique
     public int searchInsert(int[] nums, int target) {
        int spt=0;
        int ept=nums.length-1;
        int ans=nums.length;
        while(spt<=ept){
            int mid=spt+(ept-spt)/2;
            if(nums[mid]>=target){
                ans=mid;
                ept=mid-1;
            }
            else spt=mid+1;
        }
        return ans;
    }
}
