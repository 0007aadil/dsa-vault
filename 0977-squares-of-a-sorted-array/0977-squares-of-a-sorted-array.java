class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] a = new int[nums.length];

        for ( int i = 0 ; i < nums.length; i++){
            int num = nums[i];
            Math.abs(num);
            a[i] = num * num ;
        }

        Arrays.sort(a);

        return a ;
        
    }
}