class Solution {
    public int maximumCount(int[] nums) {
        int cnt_Pos=0;
        int cnt_Neg=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) cnt_Pos++;
            if(nums[i]<0) cnt_Neg++;
        }
        return Math.max(cnt_Pos,cnt_Neg);

    }
}
