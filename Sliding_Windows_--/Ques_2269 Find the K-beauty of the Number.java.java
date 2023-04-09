class Solution {
    public int divisorSubstrings(int num, int k) {
        String str=Integer.toString(num);
        int spt=0,ept=0,cnt=0;
        while(ept<str.length()){
            if(ept-spt+1<k) ept++;
            else if(ept-spt+1==k){
                String sub=str.substring(spt,ept+1);
                int val=Integer.parseInt(sub);
                System.out.println(sub+" "+val);
                if(val!=0 && num%val==0) cnt++;
                ept++;
                spt++;
            }
        }
        return cnt;
    }
}
