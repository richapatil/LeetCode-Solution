class Solution {
  
    public int heightChecker(int[] heights) {
        
        int [] sortedHeight = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sortedHeight);

        int counter = 0;
        int j = 0;

        for(int i = 0; i < heights.length; i++){

            for( ;j < sortedHeight.length;){

                if(heights[i] != sortedHeight[j]){

                    counter++;
                }
              
                j++;
                break;
            }
        }
        return counter;
    }
}
