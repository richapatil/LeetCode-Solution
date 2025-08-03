class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        if(ransomNote.length() > magazine.length()){

            return false;

        }

        HashMap<Character, Integer> ransomNoteMap = new HashMap<>();
        HashMap<Character, Integer> magazineMap = new HashMap<>();

        for(char r : ransomNote.toCharArray()){

            ransomNoteMap.put(r, ransomNoteMap.getOrDefault(r, 0) +1);
        }

        for(char m : magazine.toCharArray()){

            magazineMap.put(m, magazineMap.getOrDefault(m, 0) +1);
        }

        for(char c : ransomNoteMap.keySet()){

            int magazineCount = magazineMap.getOrDefault(c, 0);
            int ransomNoteCount = ransomNoteMap.get(c);

            if(ransomNoteCount > magazineCount){

                return false;
            }

        }

        return true;
        
    }
}


//Time Complexity - O(n + m)
//SpaceComplexity - O(n + m)


