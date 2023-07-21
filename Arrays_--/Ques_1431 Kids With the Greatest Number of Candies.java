class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int ext) {
        ArrayList<Boolean> lst=new ArrayList<>();
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]+ext>=max){
                lst.add(true);
            }
            else lst.add(false);
        }
        return lst;
    }
}
