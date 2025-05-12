class Solution {
    public int[] twoSum(int[] nums, int target) {

        //int [] matchPair = new int[2];
        int length = nums.length;

        //Arrays.sort(nums);

        for(int i = 0; i < length; i++){

            for(int j = i+1; j < length; j++){

                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        
        return new int[]{};
        
    }
}
