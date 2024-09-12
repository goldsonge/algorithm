class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length + 1];
        for (int i = 0; i < length; i ++){
            answer[i] = num_list[i];
        }
        int last;
        if(num_list[length - 1] > num_list[length - 2]){
            last = num_list[length - 1] - num_list[length - 2];
        } else {
            last = 2 * num_list[length - 1];
        }
        answer[length] = last;
        return answer;
    }
}