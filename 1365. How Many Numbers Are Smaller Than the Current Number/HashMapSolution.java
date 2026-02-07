import java.util.Arrays;

class HashMapSolution {
    
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);

        Map<Integer, Integer> valueToCount = new HashMap<>();

        for (int i = 0; i < sortedNums.length; i++) {
            valueToCount.putIfAbsent(sortedNums[i], i);
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = valueToCount.get(nums[i]);
        }

        return result;

    }
}

// TC - O(n)
// SC - O(n)
