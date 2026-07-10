class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        for (int i = n - 2; i >= 0; i--) {               
            if (nums[i] < nums[i + 1]) {
                for (int j = n - 1; j > i; j--) {          
                    if (nums[j] > nums[i]) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;

                       
                        int left = i + 1;
                        int right = n - 1;
                        while (left < right) {
                            int t = nums[left];
                            nums[left] = nums[right];
                            nums[right] = t;
                            left++;
                            right--;
                        }
                        return;   
                    }
                }
            }
        }

        
        int left = 0, right = n - 1;
        while (left < right) {
            int t = nums[left];
            nums[left] = nums[right];
            nums[right] = t;
            left++;
            right--;
        }
    }
}