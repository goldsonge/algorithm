import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> lengthCount = new HashMap<>();
        
        for (String str : strArr) {
            int len = str.length();
            lengthCount.put(len, lengthCount.getOrDefault(len, 0) + 1);
        }
        
        int maxGroupSize = 0;
        for (int count : lengthCount.values()) {
            maxGroupSize = Math.max(maxGroupSize, count);
        }
        
        return maxGroupSize;
    }
}