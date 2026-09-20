class Solution {
    static boolean isIntersect(int[][] intervals) {
        // Code Here
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        int end1=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int start2=intervals[i][0];
            int end2=intervals[i][1];
            if(end1>=start2){
                return true;
            }
            end1=Math.max(end1,end2);
        }
        return false;
    }
}