class Solution {
    public int[] solution(int[] numbers) {
        for(int i = 0; i < numbers.length; i++){
            int[] answer = new int[numbers.length];
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}