class Solution {
    public int wateringPlants(int[] arr, int cap) {
        int cnt=0;
        int var=cap;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=cap){
                cnt++;
                cap-=arr[i];
            }
            else{
                cap=var;
                cnt+=i;
                cnt+=(i+1);
                cap-=arr[i];
            }
        }
        return cnt;
    } 
}
