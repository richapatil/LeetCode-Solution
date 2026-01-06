class Solution {
  
    public static int[] runningSum(int[] nums) {

        if (nums.length == 1) {

            return nums;

        } else {

            for (int i = 0; i < nums.length; i++) {

                if (i != 0) {
                    nums[i] = nums[i - 1] + nums[i];
                }
            }
            return nums;
        }
    }
}

//Time Complexity - O(n) (One For Loop)
