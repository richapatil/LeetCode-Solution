import java.util.stream.Collectors;
import java.util.Map.Entry;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        if(nums.length == 1 && k == 1) {
			
			return nums;
		}
		
		HashMap<Integer, Integer> mapValue= new HashMap<>();
		
		int[] kValue = new int[k];

        for(int n : nums){

            mapValue.put(n, (mapValue.getOrDefault(n, 0)+1));

        }
        
        List<Entry<Integer, Integer>> collect = mapValue.entrySet().stream().sorted((k1,k2) -> k2.getValue().compareTo(k1.getValue())).collect(Collectors.toList());
        
        for (int i = 0; i < k && i < collect.size(); i++) {
            kValue[i] = collect.get(i).getKey();
        }
 
		return kValue;
        
    }
}
