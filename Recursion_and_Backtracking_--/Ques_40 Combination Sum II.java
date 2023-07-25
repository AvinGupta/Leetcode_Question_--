class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> lst_1=new ArrayList<>();
        Combinations(lst_1,arr,target,new ArrayList<Integer>(),0);
        return lst_1;
    }
    public static void Combinations(List<List<Integer>> lst_1,int[] arr,int tar,List<Integer> lst,int ind){
        if(tar==0){
            lst_1.add(new ArrayList<>(lst));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i-1]==arr[i]) continue;
            if(tar>=arr[i]){
                lst.add(arr[i]);
                Combinations(lst_1,arr,tar-arr[i],lst,i+1);
                lst.remove(lst.size()-1);
            }
        }
    }
}
