class Solution {
  
    public int removeDuplicates(int[] nums) {
        
        int valid_length = 1; 

        for(int i = 0; i < nums.length-1;i++){
          
            if(nums[i] != nums[i+1]){
              
                nums[valid_length] = nums[i+1];
                valid_length ++;

            }

        }

        return valid_length;
        
    }
}
