class Solution1 {
    public int[] productExceptSelf(int[] nums) {

        int[] finalOutput = new int[nums.length];

        int totalProd = 1;
        int zeroCount = 0;

        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                totalProd *= num;
            }
        }

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
