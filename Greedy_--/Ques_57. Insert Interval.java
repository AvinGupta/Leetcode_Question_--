class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length;
        ArrayList<int[]> lst=new ArrayList<>();
        int i=0;
        while(i<n && intervals[i][1]<newInterval[0]){
            lst.add(intervals[i++]);
        }
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        lst.add(newInterval);
        while(i<n){
            lst.add(intervals[i++]);
        }
        return lst.toArray(new int[0][]);
    }
}
