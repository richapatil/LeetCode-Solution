class Solution {
    public int[] getConcatenation(int[] nums) {

        int[] ans = Arrays.copyOf(nums, nums.length * 2);
        int numsLen = nums.length;

        for (int i = 0; i < (nums.length); i++) {

            ans[numsLen] = nums[i];
            numsLen++;

        }

        return ans;
    }
}

//TC - O(n) -- for loop
//SC - O(n) -- Intializing a new array
