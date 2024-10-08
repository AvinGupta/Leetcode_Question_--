class Solution { 
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> lst=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i],map.get(nums1[i])+1);
            }
            else{
                map.put(nums1[i],1);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                lst.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        int[] arr=new int[lst.size()];
        for(int i=0;i<arr.length;i++) arr[i]=lst.get(i);
        return arr;
    }
}
