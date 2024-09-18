class Solution {
    public int solution(int a, int b) {
        String numOne = String.valueOf(a) + String.valueOf(b); 
        int numTwo = 2 * a * b;
        int abValue = Integer.parseInt(numOne);
        if (numTwo > abValue){
            return numTwo;
        } else {
            return abValue;
        }
    }
}