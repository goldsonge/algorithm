import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> tempList = new ArrayList<>();
        
        for (int i = 1; i < n + 1; i++) {
            if (i % k == 0) {
                tempList.add(i);
            }
        }
        
        int[] answer = tempList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
