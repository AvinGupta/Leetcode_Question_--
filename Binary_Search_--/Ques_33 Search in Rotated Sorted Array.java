class Solution {
    public int search(int[] nums, int target) {
        int s_pt=0,e_pt=nums.length-1;
        while(s_pt<=e_pt){
            int mid=s_pt+(e_pt-s_pt)/2;
            if(nums[mid]==target) return mid;
            if(nums[s_pt]<=nums[mid]){
                if(target>=nums[s_pt] && target<nums[mid]) e_pt=mid-1;
                else s_pt=mid+1;
            }
            else{
                if(target>nums[mid] && target<=nums[e_pt]) s_pt=mid+1;
                else e_pt=mid-1;
            }
        }
        return -1;
    }
}
