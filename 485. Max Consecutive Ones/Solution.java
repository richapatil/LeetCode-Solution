class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int finalCount = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {

                count = count + 1;

                if (count > finalCount) {

                    finalCount = count;

                }

            } else {
                count = 0;
            }
        }

        return finalCount;

    }
}
