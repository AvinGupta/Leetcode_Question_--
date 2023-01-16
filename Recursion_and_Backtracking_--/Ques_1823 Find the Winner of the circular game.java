class Solution {
    public int findTheWinner(int n, int k) {
        return Josephus_prob(n,k)+1;//here 1 is added because indexing is starting from 1 but we have consisder indexing from 0;    
    }
    static int Josephus_prob(int n,int k){
        if(n==1) return 0;
        return (Josephus_prob(n-1,k)+k)%n;//here we are adding k because for every call starting index is changing 
                                          //here we are taking %n so that answer+k should not exceed n;
    }
}
