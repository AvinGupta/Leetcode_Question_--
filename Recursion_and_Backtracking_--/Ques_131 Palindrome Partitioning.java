class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> lst_1=new ArrayList<>();
        Partitioning(lst_1,s,new ArrayList<String>());
        return lst_1;
    }
    public static void Partitioning(List<List<String>> lst_1,String str,List<String> lst){
        if(str.isEmpty()){
            lst_1.add(new ArrayList<>(lst));
            return;
        }
        for(int i=0;i<str.length();i++){
            String stg=str.substring(0,i+1);
            if(Palindrome(stg)){
                lst.add(stg);
                Partitioning(lst_1,str.substring(i+1),lst);
                lst.remove(lst.size()-1);//Backtrack
            }
        }
    }
    //check if all the substring that are generated is palindrome or not.
    public static boolean Palindrome(String str){
        int s_pt=0;
        int e_pt=str.length()-1;
        while(s_pt<e_pt){
            if(str.charAt(s_pt)!=str.charAt(e_pt)) return false;
            s_pt++;
            e_pt--;
        }
        return true;
    }
}   
