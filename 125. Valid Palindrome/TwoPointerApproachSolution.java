class TwoPointerApproachSolution {
    public boolean isPalindrome(String s) {

        int startPoint = 0;
        int endPoint = s.length() - 1;

        while (startPoint < endPoint) {

            if (!Character.isLetterOrDigit(s.charAt(startPoint))) {

                startPoint++;

            } else if (!Character.isLetterOrDigit(s.charAt(endPoint))) {

                endPoint--;

            } else if (Character.toLowerCase(s.charAt(startPoint)) == Character.toLowerCase(s.charAt(endPoint))) {

                startPoint++;
                endPoint--;

            } else {
                return false;
            }
        }

        return true;

    }
}

// TC - O(n)
// SC - O(1)
