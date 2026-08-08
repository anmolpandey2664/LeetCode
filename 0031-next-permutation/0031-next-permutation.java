class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        
        int goal_index = -1;

        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                goal_index = i - 1;
                break;
            }
        }

       
        if (goal_index != -1) {
            int swap_index = goal_index;

            for (int j = n - 1; j > goal_index; j--) {
                if (nums[j] > nums[goal_index]) {
                    swap_index = j;
                    break;
                }
            }

            
            int temp = nums[goal_index];
            nums[goal_index] = nums[swap_index];
            nums[swap_index] = temp;
        }

        
        int left = goal_index + 1;
        int right = n - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}