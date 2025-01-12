import java.util.LinkedHashSet;

class Solution {
public String solution(String my_string) {            
        LinkedHashSet<Character> charSet = new LinkedHashSet<>();

        for (char c : my_string.toCharArray()) {
            charSet.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (char c : charSet) {
            result.append(c);
        }

        return result.toString();
    }
}