class Solution {
  
    public List<String> fizzBuzz(int n) {

        List<String> finalList =  new ArrayList<>();

        for(int i = 1; i <= n ; i++){

            if(i % 3 == 0 && i % 5 == 0){

                 finalList.add("FizzBuzz");

            }else if(i % 3 == 0){

                finalList.add("Fizz");

            }else if(i % 5 == 0){

                finalList.add("Buzz");

            }else{

                finalList.add(String.valueOf(i));

            }
        }

        return finalList;
        
    }
}
