class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int max=0;
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                int val=st.pop();
                int nse=i;
                int pse=st.isEmpty()?-1:st.peek();
                max=Math.max(max,(nse-pse-1)*arr[val]);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int val=st.pop();
            int nse=arr.length;
            int pse=st.isEmpty()?-1:st.peek();
            max=Math.max(max,(nse-pse-1)*arr[val]);
        }
        return max;
    }
}
