class Solution {
    public int numberOfSteps(int num) {
        return Helper(num,0);
    }
    public int Helper(int num,int step){
        if(num==0) return step;
        if(num%2==0) return Helper(num/2,step+1);
        return Helper(num-1,step+1);
    }
}
