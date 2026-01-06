class Solution1 {
  
    public static int[] runningSum(int[] nums) {

        if (nums.length == 1) {
            return nums;
        } else {

            int[] runningSum = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {

                int sum = 0;

                for (int j = 0; j <= i; j++) {

                    sum = sum + nums[j];
                }

                runningSum[i] = sum;
            }

            return runningSum;

        }

    }
}
//Time Complexity = O(n²)  Outer loop → n times  | Inner loop → up to n times
