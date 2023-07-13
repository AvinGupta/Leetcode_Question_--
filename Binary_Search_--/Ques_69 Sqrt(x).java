class Solution {
    public int mySqrt(int x) {
        if(x==0)return 0;
        int s_pt=1;
        int e_pt=x;
        while(s_pt<=e_pt){
            int mid=s_pt+(e_pt-s_pt)/2;
            if(x/mid==mid)return mid;
            if(x/mid<mid){
                e_pt=mid-1;
            }
            else{
                s_pt=mid+1;
            }
        }
        return e_pt; 
    }
}
