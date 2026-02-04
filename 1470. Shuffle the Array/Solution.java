class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] ans = new int[n * 2];
        int count = 0;

        for (int i = 0; i < (n); i++) {

            // Approach 1
            //ans[count++] = nums[i];
            //ans[count++] = nums[i + n];

            //Approach 2
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];

        }

        return ans;

    }
}

// TC - O(n)
// SC - O(1)
