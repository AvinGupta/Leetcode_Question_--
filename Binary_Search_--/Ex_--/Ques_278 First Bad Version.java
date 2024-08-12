/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s_pt=1;
        int e_pt=n;
        int ans=0;
        while(s_pt<=e_pt){
            int mid=s_pt+(e_pt-s_pt)/2;
            if(isBadVersion(mid)==true){
               ans=mid;
                e_pt=mid-1;
            }
            else{
                s_pt=mid+1;
            }
            
        }
        return ans;
    }
}
