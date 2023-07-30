class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> lst=new ArrayList<>();
        List<List<Integer>> lst_1 =new ArrayList<>();
        Combinations(lst,lst_1,candidates,target,0);
        return lst_1;
    }
    
    public static void Combinations(List<Integer> lst,List<List<Integer>> lst_1,int[] arr,int tar,int ind){
        if(tar==0){
            lst_1.add(new ArrayList<>(lst));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(tar>=arr[i]){
                lst.add(arr[i]);
                Combinations(lst,lst_1,arr,tar-arr[i],i);
                lst.remove(lst.size()-1);
            }
        }
    }
}
