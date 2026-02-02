class Solution {
    public int maxSubArray(int[] nums) {

        int maxSum = nums[0];

        for (int i = 0; i < nums.length; i++) {

            int curSum = 0;

            for (int j = i; j < nums.length; j++) {

                curSum += nums[j];
                maxSum = Math.max(curSum, maxSum);

            }
        }
        return maxSum;
    }
}

//TC - O(n²)
//SC - O(1)
// Note: This code works on smaller data set - gave Time Limit Exceeded after submission
