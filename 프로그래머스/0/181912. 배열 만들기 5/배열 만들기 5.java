import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> resultList = new ArrayList<>();

        for (String str : intStrs) {
            String subStr = str.substring(s, s + l);
            int num = Integer.parseInt(subStr);
            if (num > k) {
                resultList.add(num);
            }
        }

        return resultList.stream().mapToInt(i -> i).toArray();
    }
}