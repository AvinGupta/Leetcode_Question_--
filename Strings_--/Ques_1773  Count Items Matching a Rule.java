class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int ind=9;
        int cnt=0;
        if(ruleKey.equals("type")) ind=0;
        else if(ruleKey.equals("color")) ind=1;
        else if(ruleKey.equals("name")) ind=2;
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(ind).equals(ruleValue)) cnt++;
        }
        return cnt;
    }
}
