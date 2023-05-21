class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int max=-Integer.MIN_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();
        int s_pt=0;
        int e_pt=0;
        while(e_pt<s.length()){
            char ch=s.charAt(e_pt);
            if(!map.containsKey(ch)) map.put(ch,1);
            else map.put(ch,map.get(ch)+1);
            
            if(map.size()==e_pt-s_pt+1){
                max=Math.max(max,e_pt-s_pt+1);
            }
            else if(map.size()<e_pt-s_pt+1){
                while(map.size()<e_pt-s_pt+1){
                    char ch1=s.charAt(s_pt);
                    map.put(ch1,map.get(ch1)-1);
                    if(map.get(ch1)==0) map.remove(ch1);
                    s_pt++;
                }
            }
            e_pt++;
        }
        return max;
    }
}
