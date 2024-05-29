class Solution {
    public int[][] merge(int[][] arr){
        ArrayList<int[]> lst=new ArrayList<>();
        if(arr.length==0 || arr==null) return lst.toArray(new int[0][]);
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int start=arr[0][0];
        int end=arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<=end){
                end=Math.max(end,arr[i][1]);
            }
            else{
                lst.add(new int[]{start,end});
                start=arr[i][0];
                end=arr[i][1];
            }
        }
        lst.add(new int[]{start,end});
        return lst.toArray(new int[0][]);
    }
}
