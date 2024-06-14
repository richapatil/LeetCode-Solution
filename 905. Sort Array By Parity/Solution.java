class Solution {
  
    public int[] sortArrayByParity(int[] nums) {
        
        if(nums.length < 0 || nums == null) {
            return nums;
        }

        int j = 0; // to store even value at start 

        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] % 2 == 0){
                
                for (; j < nums.length;) {

                    // number swapping logic
                    
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;

                    j++; // increment of j to store the next even value

                    break;
                }
            }

        }
        
        return nums;
        
    }
}
