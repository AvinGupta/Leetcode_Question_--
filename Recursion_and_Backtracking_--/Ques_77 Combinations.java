class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] arr=new int[n];
        List<List<Integer>> lst_1=new ArrayList<>();
        Combinations(arr,lst_1,k,0,new ArrayList<Integer>(),0);
        return lst_1;
    }
    public static void Combinations(int[] arr,List<List<Integer>> lst_1,int k,int placed,List<Integer> lst,int idx){
        if(placed==k){
            lst_1.add(new ArrayList<>(lst));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            if(arr[i]==0){
                arr[i]=1;
                lst.add(i+1);
                Combinations(arr,lst_1,k,placed+1,lst,i+1);
                lst.remove(lst.size()-1);
                arr[i]=0;
            }
        }
    }
}
