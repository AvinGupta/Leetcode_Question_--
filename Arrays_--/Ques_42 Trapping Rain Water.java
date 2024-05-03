import java.lang.Math;
class Solution {
    public int trap(int[] nums) {
        int[] left=new int[nums.length];
        left[0]=nums[0];
        int[] right=new int[nums.length];
        right[nums.length-1]=nums[nums.length-1];
        
        for(int i=1;i<nums.length;i++){
            left[i]=Math.max(left[i-1],nums[i]);
        }
        
        for(int j=nums.length-2;j>=0;j--){
            right[j]=Math.max(right[j+1],nums[j]);
        }
         
        int result=0;
        for(int i=1;i<nums.length-1;i++){
            result+=Math.min(left[i],right[i])-nums[i];
        }
        
        return result;
    }
    
}
