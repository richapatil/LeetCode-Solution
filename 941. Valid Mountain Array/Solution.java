class Solution {
  
    public boolean validMountainArray(int[] arr) {
        
        if(arr.length < 3){ // mountain will require 3 elements
            
            return false;
            
        }
        
        int i = 0;
        
        for(; i < arr.length -1; i++){
            
            if(arr[i] < arr[i+1]){ // check if incrementing
                
            }else{
                break;
            }
            
        }
        
        if(i == 0 || i == arr.length-1){ // for edge condition if arr is only descreasing or increasing
            
            return false;
        }
        
        for(; i < arr.length -1; i++){
            
            if(arr[i] > arr[i+1]){ // check if decrementing
                
            }else{
                break;
            }
            
        }
        
        return i == arr.length-1;
        
    }
}
