class Solution {
    public char findTheDifference(String s, String t) {

        if (s.isEmpty()) {

            return "" != t ? t.charAt(0) : 0;
        }

        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();

        for (char schar : s.toCharArray()) {

            sMap.put(schar, sMap.getOrDefault(schar, 0) + 1);

        }

        for (char tchar : t.toCharArray()) {

            if (!sMap.containsKey(tchar)) {

                return tchar;
                
            }else {
            	
            	sMap.put(tchar, sMap.get(tchar) - 1);
            	
            	if(sMap.get(tchar) == 0) {
            		
            		sMap.remove(tchar);
            	}
            	
            }

        }

        return 0;
    }
}


-------------------
Time Complexity  - O(n)
Space Complexity - O(1) 
