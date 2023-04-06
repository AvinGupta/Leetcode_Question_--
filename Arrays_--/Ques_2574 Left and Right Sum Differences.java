class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int[] rgt_arr=new int[nums.length];
        rgt_arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            rgt_arr[i]=nums[i]+rgt_arr[i-1];
        }
        int[] lft_arr=new int[nums.length];
        lft_arr[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            lft_arr[i]=nums[i]+lft_arr[i+1];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(rgt_arr[i]-lft_arr[i]);
        }
        return nums;
    }
}
