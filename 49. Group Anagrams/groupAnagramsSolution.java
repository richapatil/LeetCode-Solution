class Solution {
  
    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs.length < 2) {
            return new ArrayList<List<String>>(Arrays.asList(Arrays.asList(strs)));
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
