//In this Type of question we use advanced Binary search
//It is similiar to aggressive cows.
class Solution {
    public int maxDistance(int[] pst, int m) {
        Arrays.sort(pst);
        int s_pt=0;
        int e_pt=pst[pst.length-1]-pst[0];
        int res=0;
        while(s_pt<=e_pt){
            int mid=s_pt+(e_pt-s_pt)/2;
            if(isPosb(pst,mid,m)){
                res=mid;
                s_pt=mid+1;
            }
            else e_pt=mid-1;
            
        }
        return res;
    }
    public static boolean isPosb(int[] arr,int mid,int m){
        int ball=1;
        int pos=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-pos>=mid){
                ball++;
                pos=arr[i];
            }  
            if(m==ball) return true;
        }
        return false;
    }
}
