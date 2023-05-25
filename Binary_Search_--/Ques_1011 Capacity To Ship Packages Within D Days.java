//This Question based on advanced binary search
// It is similiar to book allocation problem
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int s_pt=0;
        int e_pt=0;
        for(int var:weights) e_pt+=var;
        int res=0;
        while(s_pt<=e_pt){
            int mid=s_pt+(e_pt-s_pt)/2;
            if(isPosb(weights,mid,days)){
                res=mid;
                e_pt=mid-1;
            }
            else s_pt=mid+1;
        }
        return res;    
    }
    public static boolean isPosb(int[] arr,int mid,int days){
        int var=1;
        int plcd=0;
        int i=0;
        while(i<arr.length){
            if(plcd+arr[i]<=mid){
                plcd+=arr[i];
                i++;
            }
            else{
                var++;
                plcd=0;
            }
            if(var>days) return false;
        }
        return true;
    }
}
