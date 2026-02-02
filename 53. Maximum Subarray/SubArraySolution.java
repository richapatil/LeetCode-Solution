class SubArraySolution {
  
    public int maxSubArray(int[] nums) {

        int maxSum = nums[0];
        int curSum = 0;

        for (int n: nums) {

                curSum = Math.max(curSum,0);
                curSum += n;
                maxSum = Math.max(curSum, maxSum);

        }
        return maxSum;
    }
}

// TC - O(n)
// SC - O(1)
