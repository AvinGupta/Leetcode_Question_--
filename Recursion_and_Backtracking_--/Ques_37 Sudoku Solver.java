class Solution {
    static char[][] arr=new char[9][9];
    public void solveSudoku(char[][] board) {
        Sudoku_Solver(board,0,0);
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]=arr[i][j];
            }
        }
    }
    public static void Sudoku_Solver(char[][] board,int row,int col){
        if(col==9){
            row++;
            col=0;
        }
        if(row==9){
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board.length;j++){
                    arr[i][j]=board[i][j];
                }
            }
            return;
        }
        if(board[row][col]!='.') Sudoku_Solver(board,row,col+1);
        else{
            for(char val='1';val<='9';val++){
                if(isPossible(board,row,col,val)){
                    board[row][col]=val;
                    Sudoku_Solver(board,row,col+1);
                    board[row][col]='.';
                }
            }
        }

    }
    public static boolean isPossible(char[][] board,int row,int col,char val){
        int cl=0;
        while(cl<board[0].length){
            if(board[row][cl]==val) return false;
            cl++;
        }
        int rw=0;
        while(rw<board.length){
            if(board[rw][col]==val) return false;
            rw++;
        }
        rw=row-row%3;
        cl=col-col%3;
        for(int i=rw;i<rw+3;i++){
            for(int j=cl;j<cl+3;j++){
                if(board[i][j]==val) return false;
            }
        }
        return true;
    }
}
