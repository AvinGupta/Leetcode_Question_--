class Solution { 
    public int minimumRefill(int[] nums, int capA, int capB){
        int s_pt=0;
        int e_pt=nums.length-1;
        int cnt=0;
        int val1=capA;
        int val2=capB;
        while(s_pt<=e_pt){
            if(s_pt==e_pt){
                if(capA>=capB) {
                    if(nums[s_pt]>capA) cnt++;
                }
                else{
                    if(nums[e_pt]>capB) cnt++;
                }
                break;
            }
            if(nums[s_pt]>capA){
                cnt++;
                capA=val1;
            }
            if(nums[e_pt]>capB){
                cnt++;
                capB=val2;
            }
            capA-=nums[s_pt];
            capB-=nums[e_pt];
            s_pt++;
            e_pt--;
        }
        return cnt;
    }
}
