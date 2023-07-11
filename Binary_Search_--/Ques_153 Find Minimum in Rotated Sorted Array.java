class Solution {
    public int findMin(int[] arr) {
        int s_pt=0,e_pt=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while(s_pt<=e_pt){
            int mid=s_pt+(e_pt-s_pt)/2;
            if(arr[s_pt]<=arr[mid]){
                ans=Math.min(ans,arr[s_pt]);
                s_pt=mid+1;
            }
            else{
                ans=Math.min(ans,arr[mid]);
                e_pt=mid-1;
            }
        }
        return ans;
    }
}
