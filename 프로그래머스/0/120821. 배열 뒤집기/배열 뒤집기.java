class Solution {
    public int[] solution(int[] num_list) {
        int index = num_list.length;
        int[] answer = new int[index];
        
        for(int i = 0; i < index; i++) {
            answer[i] = num_list[index - i - 1];
        }
        
        return answer;
    }
}