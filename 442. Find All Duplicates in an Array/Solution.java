class Solution {
  
    public List<Integer> findDuplicates(int[] nums) {

        HashMap<Integer, Integer> mapValue= new HashMap<>();

        for(int n : nums){

            mapValue.put(n, (mapValue.getOrDefault(n, 0)+1));

        }

        List<Integer> duplicateValue = new ArrayList<>();   

        for(Map.Entry<Integer, Integer> entry : mapValue.entrySet()){

            if(entry.getValue() > 1){

                duplicateValue.add(entry.getKey());

            }
        }
        return duplicateValue;
    }
}
