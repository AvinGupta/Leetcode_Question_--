class Solution {
    public int candy(int[] ratings) {
        // it is done using slope method.
        int cnt=1;
        int i=1;
        while(i<ratings.length){
            if(ratings[i]==ratings[i-1]){
                cnt+=1;
                i+=1;
                continue;
            }
            int peak=1;
            while(i<ratings.length && ratings[i]>ratings[i-1]){
                peak+=1;
                i+=1;
                cnt+=peak;
            }
            int down=1;
            while(i<ratings.length && ratings[i]<ratings[i-1]){
                cnt+=down;
                down+=1;
                i+=1;
            }
            if(down>peak){
                cnt+=(down-peak);
            }
        }
        return cnt;
    }
}
