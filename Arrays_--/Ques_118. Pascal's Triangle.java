class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lst_1=new ArrayList<>();
        Pascal_Triangle(lst_1,numRows);
        return lst_1;
    }
    public static void Pascal_Triangle(List<List<Integer>> lst_1,int row){
        for(int i=0;i<row;i++){
            List<Integer> lst=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i) lst.add(1);
                else lst.add(lst_1.get(i-1).get(j)+lst_1.get(i-1).get(j-1));
            }
            lst_1.add(lst);
        }
    }
}
