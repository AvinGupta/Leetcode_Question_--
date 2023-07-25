class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lst_1=new ArrayList<>();
        List<Integer> lst=new ArrayList<>();
        Sub(nums,lst_1,lst,0);
        return lst_1;
        
    }
    public static void Sub(int[] arr, List<List<Integer>> lst_1,List<Integer> lst,int ind){
        if(ind==arr.length){
            lst_1.add(new ArrayList<>(lst));//adding temporary list to answer list
            return;
        }
        Sub(arr,lst_1,lst,ind+1);
        lst.add(arr[ind]);//adding value
        Sub(arr,lst_1,lst,ind+1);
        lst.remove(lst.size()-1);//remove value after the call
    }
}


// OR

class Solution {
        public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
