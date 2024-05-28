class Solution {
    public boolean canJump(int[] nums) {
        int reached=0;
        for(int i=0;i<nums.length;i++){
            if(i>reached) return false;
            reached=Math.max(reached,i+nums[i]);
            if(reached>=nums.length-1) return true;
        }
        return true;
    }
}
