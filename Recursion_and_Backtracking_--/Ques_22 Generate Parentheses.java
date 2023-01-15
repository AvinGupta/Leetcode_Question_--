class Solution {
    public List<String> generateParenthesis(int n) 
    {
        List<String> lst=new ArrayList<>();
        Gen_Par(n,0,0,"",lst);
        return lst;
    }
    public static void Gen_Par(int n,int opn,int cls,String str,List<String> lst){
        if(opn==n && cls==n){
            lst.add(str);
            return;
        }
        if(opn<n) Gen_Par(n,opn+1,cls,str+'(',lst);
        if(cls<opn) Gen_Par(n,opn,cls+1,str+')',lst);
    }
}
