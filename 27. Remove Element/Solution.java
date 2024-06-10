class Solution {
    public int removeElement(int[] nums, int val) {
        
       int valid_length = 0; 

        for(int i = 0; i < nums.length;i++){
          
            if(nums[i] != val){ // if not the same val add the ith value to the array
              
                nums[valid_length] = nums[i];
                valid_length ++;

            }
        }
        return valid_length;
    }
}
