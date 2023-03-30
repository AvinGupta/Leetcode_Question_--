class Solution {
    public int mostWordsFound(String[] sentences) {
        int sum=0;
        for(int i=0;i<sentences.length;i++){
            String[] arr=sentences[i].split(" ");
            sum=Math.max(sum,arr.length);
        }
        return sum;
    }
}
