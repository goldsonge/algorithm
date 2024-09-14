class Solution {
    public int solution(int[] array, int height) {
        int number = 0;
        for(int i = 0; i < array.length; i++) {
            int[] answer = new int[array.length];
            if (array[i] > height) {
                number++;
            }
        }
        return number;
    }
}