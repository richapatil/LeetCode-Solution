class Solution {
  
    public int thirdMax(int[] nums) {
        
        Set<Integer> newList = new HashSet<>();
        
        for (int val : nums) {
            newList.add(val);
        }

        List<Integer> sortedNumbers = new ArrayList<>(newList);
        Collections.sort(sortedNumbers);

        if(sortedNumbers.size() < 3){

            return sortedNumbers.getLast();

        }else{

            return sortedNumbers.get(sortedNumbers.size()-3);
        }
    }
}
