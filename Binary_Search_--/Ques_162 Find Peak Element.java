class Solution {
    public int findPeakElement(int[] arr) {
        if(arr.length==1) return 0;
        else if(arr[0]>arr[1]) return 0;
        else if(arr[arr.length-1]>arr[arr.length-2]) return arr.length-1;
        else{
            int spt=1;
            int ept=arr.length-2;
            while(spt<=ept){
                int mid=spt+(ept-spt)/2;
                if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]) return mid;
                else if(arr[mid]>arr[mid-1]) spt=mid+1;
                else if(arr[mid]>arr[mid+1]) ept=mid-1;
                else ept=mid-1;
            }
        }
        return -1;
    }
}
