class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=nums[i];
        }
        return (len*(len+1))/2-ans;
    }
}
