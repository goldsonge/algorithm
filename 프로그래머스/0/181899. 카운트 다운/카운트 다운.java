class Solution {
    public int[] solution(int start_num, int end_num) {
        int num = start_num - end_num + 1;
        int[] answer = new int[num];
        for(int i = 0; i < num; i++){
            answer[i] = start_num - i;
        }
        return answer;
    }
}