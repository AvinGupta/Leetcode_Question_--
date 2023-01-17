class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> lst=new ArrayList<>();
        List<List<Integer>> lst_1=new ArrayList<>();
        Permutation(nums,lst,lst_1);
        return lst_1;
    }
    public static void Permutation(int[] nums,List<Integer> lst,List<List<Integer>> lst_1){
        if(lst.size()==nums.length){
            lst_1.add(new ArrayList<>(lst));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(lst.contains(nums[i])) continue;// checcking for duplicates
            lst.add(nums[i]);
            Permutation(nums,lst,lst_1);
            lst.remove(lst.size()-1);
        }
    }
}
