class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean ans=Word_Search(board,i,j,word,0);
                    if(ans) return ans;
                }
            }
        }
        return false;
    }
    public static boolean Word_Search(char[][] board,int cur_rw,int cur_cl,String str,int ind){
        if(ind==str.length()) return true;
        if(cur_rw>=board.length || cur_rw<0 || cur_cl<0 ||cur_cl>=board[0].length || board[cur_rw][cur_cl]!=str.charAt(ind)) return false;
        int[] rw={-1,1,0,0};
        int[] cl={0,0,1,-1};
        board[cur_rw][cur_cl]='#';
        for(int i=0;i<rw.length;i++){
            boolean ans=Word_Search(board,cur_rw+rw[i],cur_cl+cl[i],str,ind+1);
            if(ans) return true;
        }
        board[cur_rw][cur_cl]=str.charAt(ind);
        return false;
    }
}
