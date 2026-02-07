public class HashMapSolution {
  
    public int[] findErrorNums(int[] nums) {

        Map<Integer, Integer> map = new HashMap();

        int duplicate = -1, missing = 1;

        for (int n : nums) {

            map.put(n, map.getOrDefault(n, 0) + 1);

        }
        for (int i = 1; i <= nums.length; i++) {

            if (map.containsKey(i)) {

                if (map.get(i) == 2) {

                    duplicate = i;
                }
            } else {

                missing = i;
            }
        }
        return new int[] { duplicate, missing };
    }
}

//TC - O(n)
//SP - O(n)
