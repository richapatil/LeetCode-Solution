class Solution {
    public int[] findErrorNums(int[] nums) {

        Arrays.sort(nums);

        int prev = nums[0];
        int duplicate = 0;
        int missing = 0;

        for (int n = 1; n < nums.length; n++) {

            if (nums[n] == prev) {

                duplicate = nums[n];

            } else if (nums[n] > prev + 1) {

                missing = prev + 1;
                prev = nums[n];

            } else {

                prev = nums[n];
                continue;
            }

        }

        if (missing == 0) {
            if (nums[0] != 1)
                missing = 1;
            else
                missing = nums.length;
        }

        return new int[] { duplicate, missing };

    }
}

//TC - O(n log n)
//SC - O(log n)
