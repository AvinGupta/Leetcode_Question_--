class Solution {
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
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){// here we are removing only greater element not the equal ones.
              //because we dont want to consider duplicate element twice for ex.{1,1} array were nse{2,2} and pse{-1,0}.
                st.pop();
            }
            if(!st.isEmpty()) ans[i]=st.peek();
            else ans[i]=-1;
            st.push(i);
        }
        return ans;
    }
    public int sumSubarrayMins(int[] arr) {
        int[] nse=nextSmallerElement(arr);
        int[] pse=previousSmallerElement(arr);
        long ans=0;
        int mod=(int)1e9+7;
        for(int i=0;i<arr.length;i++){
            int left=i-pse[i];
            int right=nse[i]-i;
            ans=(ans+(long)right*left*arr[i])%mod;
        }
        return (int)ans;
    }
}
