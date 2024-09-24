class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] temp = new int[numlist.length]; 
        int count = 0;

        for (int num : numlist) {
            if (num % n == 0) { 
                temp[count] = num; 
                count++;
            }
        }

        int[] answer = new int[count];
        for (int i = 0; i < count; i++) {
            answer[i] = temp[i];
        }

        return answer;
    }
}