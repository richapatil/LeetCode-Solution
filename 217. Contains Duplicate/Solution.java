class Solution {
    public boolean containsDuplicate(int[] nums) {
      
        HashMap<Integer, Integer> uniKey = new HashMap<Integer, Integer>();

        for(int n : nums){

            if(uniKey.containsKey(n)){
              
                return true;
              
            }else{
              
                uniKey.put(n,n);
              
            }
        }

        return false;
    }
}
