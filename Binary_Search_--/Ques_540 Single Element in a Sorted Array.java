class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
        else if(nums[0]!=nums[1]) return nums[0];
        else if(nums[nums.length-1]!=nums[nums.length-2]) return nums[nums.length-1];
        else{
            int spt=1;
            int ept=nums.length-2;
            while(spt<=ept){
                int mid=spt+(ept-spt)/2;
                if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];
                if((mid%2==1 && nums[mid]==nums[mid-1]) || (mid%2==0) && nums[mid]==nums[mid+1]) spt=mid+1;
                else ept=mid-1;
            }
        }
        return -1;
    }
}
