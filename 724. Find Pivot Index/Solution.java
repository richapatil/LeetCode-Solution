class Solution {
  
    public int pivotIndex(int[] nums) {

        if(nums.length == 0){
            return -1;
        }
        
        int rightSum = 0;
        int leftSum = 0;
        
        for(int number : nums){
            rightSum = rightSum + number;
        }
        
        for(int i = 0; i < nums.length; i++){
            
            rightSum = rightSum - nums[i];
            
            if(rightSum == leftSum){
                
                return i;
                
            }else{
                
                leftSum = leftSum + nums[i];
                
            }
        }
        
        return -1;
    }
}
