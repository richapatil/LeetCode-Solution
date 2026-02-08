class Solution {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        StringBuilder sb = new StringBuilder(s);
        String sbr = sb.reverse().toString().toLowerCase();

        if (sbr.equalsIgnoreCase(s)) {

            return true;
        }

        return false;

    }
}

//TC - O(n)
//SC - O(n)
