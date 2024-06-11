class Solution {
    
    public boolean checkIfExist(int[] arr) {

        if (null == arr && arr.length <= 0) {

            return false;
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (i != j) {

                    if (arr[i] == 2 * arr[j]) {
                        return true;

                    }
                }

            }

        }

        return false;

    }
}
