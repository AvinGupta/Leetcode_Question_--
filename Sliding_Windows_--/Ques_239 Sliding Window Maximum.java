class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
      //if window size is greater then the size of array itself then calculate the maximum of array only
      if(k>nums.length){
            int max=nums[0];
             for(int i=1;i<nums.length;i++){
                if(nums[i]>max) max=nums[i];
            }
            return new int[] {max};
        }
        // sliding window
        else{
            // deque(doubly ended queue) is used as a data structure using which we can add and remove the value from both ends
            Deque<Integer> dq=new LinkedList<>();
            int[] arr=new int[nums.length-k+1];
            int s_pt=0;
            int e_pt=0;
            while(e_pt<nums.length){
                if(dq.size()==0) dq.add(nums[e_pt]);
                else{
                    while(dq.size()>0 && dq.peekLast()<nums[e_pt]) dq.removeLast();
                    dq.add(nums[e_pt]);
                }
                if((e_pt-s_pt+1)<k) e_pt++;
                else if((e_pt-s_pt+1)==k){
                    arr[s_pt]=dq.peek();
                    if(nums[s_pt]==dq.peek()) dq.removeFirst();
                    e_pt++;
                    s_pt++;
                }
            }
            return arr;
        }
        
    }
}
