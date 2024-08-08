class Solution {
    public static int area(int[] arr){
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
    public int maximalRectangle(char[][] matrix) {
        int[] arr=new int[matrix[0].length];
        int ans=0;
        for(int i=matrix.length-1;i>=0;i--){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='1'){
                    arr[j]=arr[j]+1;
                }
                else{
                    arr[j]=0;
                }
            }
            int area=area(arr);
            ans=Math.max(area,ans);
        }
        return ans;
    }
}
