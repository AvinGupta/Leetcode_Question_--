class Solution {
    public long subArrayRanges(int[] nums) {
        return sumSubarrayMaxs(nums)-sumSubarrayMins(nums);
    }
    public int[] nextSmallerElement(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(!st.isEmpty()) ans[i]=st.peek();
            else ans[i]=arr.length;
            st.push(i);
        }
        return ans;
    }
    public int[] previousSmallerElement(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(!st.isEmpty()) ans[i]=st.peek();
            else ans[i]=-1;
            st.push(i);
        }
        return ans;
    }
    public long sumSubarrayMins(int[] arr) {
        int[] nse=nextSmallerElement(arr);
        int[] pse=previousSmallerElement(arr);
        long ans=0;
        // int mod=(int)1e9+7;
        for(int i=0;i<arr.length;i++){
            int left=i-pse[i];
            int right=nse[i]-i;
            ans=(ans+(long)right*left*arr[i]);
        }
        return ans;
    }






    public long sumSubarrayMaxs(int[] arr) {
        int[] nge=nextGreaterElement(arr);
        int[] pge=previousGreaterElement(arr);
        long ans=0;
        // int mod=(int)1e9+7;
        for(int i=0;i<arr.length;i++){
            int left=i-pge[i];
            int right=nge[i]-i;
            ans=(ans+(long)right*left*arr[i]);
        }
        return ans;
    }
    public int[] nextGreaterElement(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(!st.isEmpty()) ans[i]=st.peek();
            else ans[i]=arr.length;
            st.push(i);
        }
        return ans;
    }
    public int[] previousGreaterElement(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                st.pop();
            }
            if(!st.isEmpty()) ans[i]=st.peek();
            else ans[i]=-1;
            st.push(i);
        }
        return ans;
    }
}
