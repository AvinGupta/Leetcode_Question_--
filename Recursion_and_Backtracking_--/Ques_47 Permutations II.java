class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lst_1=new ArrayList<>();
        Permutations(nums,lst_1,new ArrayList<Integer>(),new boolean[nums.length]);
        return lst_1; 
    }
    public static void Permutations(int[] nums,List<List<Integer>> lst_1,List<Integer> lst,boolean[] arr){
        if(lst.size()==nums.length){
            lst_1.add(new ArrayList<>(lst));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(arr[i] || (i>0 && nums[i]==nums[i-1] && !arr[i-1])) continue;
            lst.add(nums[i]);
            arr[i]=true;
            Permutations(nums,lst_1,lst,arr);
            arr[i]=false;
            lst.remove(lst.size()-1);
        }
    } 
}
