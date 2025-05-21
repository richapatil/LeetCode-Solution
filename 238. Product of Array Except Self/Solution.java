class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] finalOutput = new int[nums.length];

        int totalProd = Arrays.stream(nums).filter(n -> n != 0).reduce(1, (a, b) -> a * b);

        long zeroCount = Arrays.stream(nums).filter(n -> n == 0).count();

        for (int i = 0; i < nums.length; i++) {

            if (zeroCount > 1) {

                finalOutput[i] = 0;

            }

            else if (zeroCount == 1) {

                finalOutput[i] = nums[i] != 0 ? 0 : totalProd;

            } else {

                finalOutput[i] = totalProd / nums[i];
            }
        }
        return finalOutput;
    }
}
