class Solution {
    public int[] sortedSquares(int[] nums) {
        
        ArrayList<Integer> sorted = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            sorted.add(nums[i] * nums[i]);

        }

        Collections.sort(sorted);

        int[] intArray = sorted.stream().mapToInt(Integer::intValue).toArray();
        
        return intArray;
    }
}
