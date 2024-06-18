class Solution {

    public int maximumWealth(int[][] accounts) {

        int maxWealth = 0;
    
        for (int i = 0; i < accounts.length; i++) {

            int addedVal = 0;

            for (int j = 0; j < accounts[i].length; j++) {

                addedVal = addedVal + accounts[i][j];

            }
            if (addedVal > maxWealth) {
                maxWealth = addedVal;
            }
        }
        return maxWealth;
    }
}
