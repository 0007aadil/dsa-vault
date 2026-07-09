class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        


        int[] arr = new int[n];

        arr[0] = 0 ;

        for ( int i =1 ; i < n; i++){
            if ( Math.abs(nums[i] - nums[i-1]) <= maxDiff){
                arr[i] = arr[i-1];
            }else {
                arr[i]= arr[i-1] + 1;
            }
        }

        boolean[] res = new boolean[queries.length];

        for ( int i = 0 ; i < queries.length; i++){

            int u = queries[i][0];
            int v = queries[i][1];

            res[i] = (arr[u] == arr[v]);

        }

        return res;
    }
}