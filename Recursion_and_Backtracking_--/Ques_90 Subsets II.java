class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lst_1=new ArrayList<>();
        Subsets(lst_1,nums,new ArrayList<>(),0);
        return lst_1;
    }
    public static void Subsets(List<List<Integer>> lst_1,int[] nums,List<Integer> lst,int idx){
        lst_1.add(new ArrayList<>(lst));
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]) continue;
            lst.add(nums[i]);
            Subsets(lst_1,nums,lst,i+1);
            lst.remove(lst.size()-1);
        }
    }
}
