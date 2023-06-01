class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int s_pt=0;
        int e_pt=0;
        int ans=Integer.MIN_VALUE;
        int sum=0;
        while(e_pt<nums.length){
            sum+=nums[e_pt];
            if(e_pt-s_pt+1<k) e_pt++;
            else if(e_pt-s_pt+1==k){
                ans=Math.max(ans,sum);
                sum-=nums[s_pt];
                e_pt++;
                s_pt++;
            }
        }
        return (ans*1.0)/k;
        
    }
}
