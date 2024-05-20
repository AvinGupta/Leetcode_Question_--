class Solution {
    public int differenceOfSum(int[] nums) {
        int ELE_sum=0;
        int DIG_sum=0;
        for(int var:nums){
            ELE_sum+=var; 
            DIG_sum+=dig(var);
        }
        return Math.abs(DIG_sum-ELE_sum);
    }
    public static int dig(int num){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}
