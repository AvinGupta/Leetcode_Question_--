class Solution {
    static String[] arr={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)return new ArrayList<String>();
        List<String> lst=new ArrayList<>();
        Combinations(digits,lst,0,"");
        return lst;
    }
    public static void Combinations(String str,List<String> lst,int ind,String ans){
        if(ans.length()==str.length()){
            System.out.println(ans);
            lst.add(ans);
            return;
        }
        char in = str.charAt(ind);
        String mod = arr[in -'1'];
        for(int i=0;i<mod.length();i++){
            Combinations(str,lst,ind+1,ans+mod.charAt(i));
        }
    }
}
