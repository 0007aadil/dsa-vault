class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort (intervals , (x,y) -> x[0] != y[0] ? x[0] -y[0] : y[1] - x[1] );

        int count = 0;

    int prevNum = 0;

    for(int[] inteval : intervals){
        int end = inteval[1];

        if ( end > prevNum ) {
            prevNum = end;
            count++;
        }
    }

    return count;



    }
}