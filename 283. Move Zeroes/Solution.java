class Solution {
    
    public void moveZeroes(int[] nums) {
        
        for(int i = 0; i < nums.length -1; i++){
            
            if(nums[i] == 0){ // check if zero
                
                int j = i+1; // set j to +1 for another value which is not zero
                
                for(; j < nums.length; j++){
                    
                    if(nums[j] != 0){ // if not zero 
                        
                        nums[i] = nums[j]; // the assign the value to i
                        nums[j] = 0; // and the j value to zero
                        break; // break the for loop
                        
                    }
                    
                }
            }
            
        }
        
    }
}
