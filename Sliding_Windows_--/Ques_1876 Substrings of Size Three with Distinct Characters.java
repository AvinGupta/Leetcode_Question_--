class Solution {
    public int countGoodSubstrings(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int s_pt=0;
        int e_pt=0;
        int cnt=0;
        while(e_pt<s.length()){
            char ch=s.charAt(e_pt);
            if(!map.containsKey(ch)) map.put(ch,1);
            else map.put(ch,map.get(ch)+1);
            if(e_pt-s_pt+1<3) e_pt++;
            else if(e_pt-s_pt+1==3){
                if(map.size()==3) cnt++;
                map.put(s.charAt(s_pt),map.get(s.charAt(s_pt))-1);
                if(map.get(s.charAt(s_pt))==0) map.remove(s.charAt(s_pt));
                e_pt++;
                s_pt++;
            }
        }
        return cnt;
    }
}
