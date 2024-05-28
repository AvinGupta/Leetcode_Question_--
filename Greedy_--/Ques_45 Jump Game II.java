class Solution {
    public int jump(int[] nums) {
        int left=0;
        int right=0;
        int jumps=0;
        while(right<nums.length-1){
            int temp=0;
            for(int i=left;i<=right;i++){
                temp=Math.max(temp,i+nums[i]);
            }
            left=right+1;
            right=temp;
            jumps+=1;
        }
        return jumps;
    }
}
