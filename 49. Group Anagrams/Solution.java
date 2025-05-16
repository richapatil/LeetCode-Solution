class Solution {
  
    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs.length < 2) {

            return new ArrayList<List<String>>(Arrays.asList(Arrays.asList(strs)));

        }

        List<String> sortedWords = new ArrayList<>();
        List<List<String>> groupedAnagrams = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];

            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if (sortedWords.contains(sorted)) {

                int index = sortedWords.indexOf(sorted);
                groupedAnagrams.get(index).add(word);

            } else {

                sortedWords.add(sorted);
                List<String> newGroup = new ArrayList<>();
                newGroup.add(word);
                groupedAnagrams.add(newGroup);

            }
        }

        return groupedAnagrams;

    }
}
