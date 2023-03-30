class Solution {
    public int countSubstrings(String s) {
        int cnt=0;
        for(int axs=0;axs<s.length();axs++){
            for(int orbt=0;axs-orbt>=0 && axs+orbt<s.length();orbt++){
                if(s.charAt(axs-orbt)!=s.charAt(axs+orbt)) break;
                else cnt++;
            }
        }
        for(double axs=0.5;axs<s.length();axs++){
            for(double orbt=0.5;axs-orbt>=0 && axs+orbt<s.length();orbt++){
                if(s.charAt((int)(axs-orbt))!=s.charAt((int)(axs+orbt))) break;
                else cnt++;
            }
        }
        return cnt;
    }
}
