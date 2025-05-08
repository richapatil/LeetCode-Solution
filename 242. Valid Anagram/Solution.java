class Solution {
  
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> mapSValue= new HashMap<>();

        for(char sLettter : s.toCharArray()){

            mapSValue.put(sLettter, (mapSValue.getOrDefault(sLettter, 0)+1));

        }

        HashMap<Character, Integer> mapTValue= new HashMap<>();

        for(char tLettter : t.toCharArray()){

            mapTValue.put(tLettter, (mapTValue.getOrDefault(tLettter, 0)+1));

        }

        return mapSValue.equals(mapTValue);
        
    }
}
