class Solution {
    public int largestRectangleArea(int[] heights) {
        return Area(heights);
    } 
    public static int Area(int[] arr){
        Stack<Integer> stk=new Stack<>();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            while(!stk.isEmpty() && arr[i]<arr[stk.peek()]){
                int rgt=i;
                int hgt=arr[stk.pop()];
                if(stk.isEmpty()){
                   ans=Math.max(ans,hgt*rgt);
                }
                else{
                    int lft=stk.peek();
                    ans=Math.max(ans,hgt*(rgt-lft-1));
                }
            }
            stk.push(i);
        }
        int rgt= arr.length;
        while(!stk.isEmpty()){
            int hgt=arr[stk.pop()];
            if(stk.isEmpty()){
                ans=Math.max(ans,hgt*rgt);
            }
            else{
                int lft=stk.peek();
                ans=Math.max(ans,hgt*(rgt-lft-1));
            }
        }
        return ans;
    }
}
