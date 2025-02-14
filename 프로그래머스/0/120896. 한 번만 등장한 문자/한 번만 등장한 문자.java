import java.util.*;

class Solution {
    public String solution(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        
        List<Character> uniqueChars = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (freq.get(c) == 1) {
                uniqueChars.add(c);
            }
        }
        
        Collections.sort(uniqueChars);
        
        StringBuilder sb = new StringBuilder();
        for (char c : uniqueChars) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}