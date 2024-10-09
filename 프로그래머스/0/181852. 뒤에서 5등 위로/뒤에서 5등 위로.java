import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int length = Math.min(num_list.length, 5);
        
        int[] answer = Arrays.copyOfRange(num_list, length, num_list.length);
        return answer;
    }
}