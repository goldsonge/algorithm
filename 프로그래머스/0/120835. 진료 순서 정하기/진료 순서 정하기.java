import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

class Solution {
    public int[] solution(int[] emergency) {
        Integer[] sorted = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(sorted, Collections.reverseOrder());

        HashMap<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < sorted.length; i++) {
            rankMap.put(sorted[i], i + 1);
        }

        int[] result = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            result[i] = rankMap.get(emergency[i]);
        }

        return result;
    }
}