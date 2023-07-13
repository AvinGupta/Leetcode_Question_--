class Solution {
    public int findKthPositive(int[] arr, int k) {
        // brute force/naive approch:--
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k) k++;
            else break;
        }
        return k;

        // optimised/better approch:--
        int spt=0;
        int ept=arr.length-1;
        while(spt<=ept){
            int mid=spt+(ept-spt)/2;
            int miss=arr[mid]-(mid+1);
            if(miss<k)  spt=mid+1;
            else ept=mid-1;
        }
        return spt+k;
    }
}
