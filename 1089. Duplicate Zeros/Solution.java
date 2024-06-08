class Solution {
    public void duplicateZeros(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {

                int j;

                for (j = arr.length - 2; j > i; j--) { // -2 as to index out of bond error

                    arr[j + 1] = arr[j];

                }

                arr[j + 1] = 0; // Assigning consecutive zero

                i++; // Adding up so that newly added 0 isn't counted
            }
        }

    }
}
