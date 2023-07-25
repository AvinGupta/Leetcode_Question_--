class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr=new int[9];
        List<List<Integer>> lst_1=new ArrayList<>();
        Combinations(lst_1,k,n,0,new ArrayList<Integer>(),arr,0);
        return lst_1;
    }
    public static void Combinations(List<List<Integer>> lst_1,int k,int n,int placed,List<Integer> lst,int[] arr,int ind){
        int sum=0;
        for(int i=0;i<lst.size();i++){
            sum+=lst.get(i);
        }
        if(k==placed && sum==n){
            lst_1.add(new ArrayList<>(lst));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(arr[i]==0){
                arr[i]=1;
                lst.add(i+1);
                Combinations(lst_1,k,n,placed+1,lst,arr,i);
                lst.remove(lst.size()-1);
                arr[i]=0;
            }
        }
    }
}
