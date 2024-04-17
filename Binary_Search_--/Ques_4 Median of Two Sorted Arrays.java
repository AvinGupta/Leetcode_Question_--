class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        if(n>m){
            return  findMedianSortedArrays(nums2, nums1) ;
        }
         
        int spt=0,ept=n;
        while(spt <= ept){
            int mid1=(spt + ept)/2;
            int mid2=((n+m+1)/2)-mid1;
            
                int min1=(mid1==n)?Integer.MAX_VALUE:nums1[mid1];
                int max1=(mid1==0)?Integer.MIN_VALUE:nums1[mid1-1];
                int min2=(mid2==m)?Integer.MAX_VALUE : nums2[mid2];
                int max2=(mid2==0)?Integer.MIN_VALUE : nums2[mid2-1];
                    
             if(max1<=min2 && max2<=min1)
             {
                 if((n+m)%2 == 0)
                     return (double)(Math.max(max1,max2)+Math.min(min1,min2))/2;
                 else
                      return  (double)Math.max(max1,max2)  ;
             }else if(max1>  min2)
                    ept=mid1-1;
              else
                    spt=mid1+1;                         
        }
        return -1;
    }
}
