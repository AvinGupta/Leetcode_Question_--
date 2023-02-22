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
}
