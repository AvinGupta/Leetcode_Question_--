class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        List<List<String>> lst_1=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j]='.';
            }
        }
        N_Queens(lst_1,board,0,n);
        return lst_1;
    }
    public static void N_Queens(List<List<String>> lst_1,char[][] board,int rw,int cnt){
        if(cnt==0){
            List<String> lst=new ArrayList<>();
            for(int i=0;i<board.length;i++){
                String str="";
                for(int j=0;j<board[i].length;j++){
                    str+=board[i][j];
                }
                lst.add(str);
            }
            lst_1.add(new ArrayList<>(lst));
            return;
        }
        if(rw==board.length) return;
        for(int cl=0;cl<board[0].length;cl++){
            if(isPossible(board,rw,cl)){
                board[rw][cl]='Q';
                N_Queens(lst_1,board,rw+1,cnt-1);
                board[rw][cl]='.';
            }
        }
    }
    public static boolean isPossible(char[][] board,int row,int col){
        int rw=row;
        while(rw>=0){
            if(board[rw][col]=='Q') return false;
            rw--;
        }
        rw=row;
        int cl=col;
        while(rw>=0 && cl>=0){
            if(board[rw][cl]=='Q') return false;
            rw--;
            cl--;
        }
        rw=row;
        cl=col;
        while(rw>=0 && cl<board[0].length){
            if(board[rw][cl]=='Q') return false;
            rw--;
            cl++;
        }
        return true;
    }
}
