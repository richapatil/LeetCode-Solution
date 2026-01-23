class SolutionHashSet {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> uniKey = new HashSet<Integer>();

        for (int n : nums) {

            if (uniKey.contains(n)) {
                return true;
            }
            uniKey.add(n);
        }

        return false;
    }

}

//TC - O(n)
//SC - O(n)
