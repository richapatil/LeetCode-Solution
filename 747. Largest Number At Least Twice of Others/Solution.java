class Solution {
  
    public int dominantIndex(int[] nums) {
        
        int max = 0;
        int index = -1;
        
        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] > max){
                max =+ nums[i];
                index = i;
            }
        }
        int middleRange = max/2;

        for(int j = 0; j < nums.length; j++){
            
            if(nums[j]==max)
            {
                continue;
            }
            if(nums[j]>middleRange){

              return -1;

             }
        }

        return index;
        
    }
}
