class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);

        int[] returnDuplicate = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int val = nums[i];

            int firstIndex = 0;
            while (firstIndex < sortedNums.length && sortedNums[firstIndex] < val) {
                firstIndex++;
            }

            returnDuplicate[i] = firstIndex;

        }

        return returnDuplicate;

    }
}

//TC - O(n log n) + O(n²) =  O(n²)
// SC - O(log n)
