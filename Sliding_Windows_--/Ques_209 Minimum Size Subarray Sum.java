class Solution {
  public int minSubArrayLen(int target, int[] nums){
        if(nums.length==0) return 0;
        int s_pt=0;
        int e_pt=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        while(e_pt<nums.length){
            sum+=nums[e_pt];
            while(sum>=target){
                ans=Math.min(ans,e_pt-s_pt+1);
                sum-=nums[s_pt];
                s_pt++;   
            }
            e_pt++;
        }
        return ans==Integer.MAX_VALUE?0:ans;
	}
}

