class Pair{
    int val;
    int span;
    Pair(int val,int span){
        this.val=val;
        this.span=span;
    }
}
class StockSpanner {
    Stack<Pair> st;
    public StockSpanner() {
        st=new Stack<Pair>();
    }
    public int next(int price) {
        int span=1;
        while(!st.isEmpty() && st.peek().val<=price){
            span+=st.pop().span;
        }
        st.push(new Pair(price,span));
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
