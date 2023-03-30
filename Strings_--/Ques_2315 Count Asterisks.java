class Solution {
    public int countAsterisks(String s) {
        int cnt=0;
        int var=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|') var++;
            if(s.charAt(i)=='*' && var%2==0) cnt++;
        }
        return cnt;
    }
}
