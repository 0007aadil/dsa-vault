class Solution {
    public int[][] merge(int[][] intervals) {


        Arrays.sort(intervals , (a,b) -> a[0] - b[0]);

        ArrayList<int[]> arr = new ArrayList<>();


        int[] curr = intervals[0];
        arr.add(curr);

        for ( int i = 1 ; i < intervals.length; i++){
            int count = 0 ;

            if ( intervals[i][0] <= curr[1]){
                curr[1] = Math.max(curr[1] , intervals[i][1]);
                count++;
            }

            if ( count == 0){
                curr = intervals[i];
                arr.add(curr);
            }
        }


        return arr.toArray(new int[arr.size()][]);
        
    }
}