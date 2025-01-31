import java.util.Arrays;

public class Solution {
    public String[] solution(String myString) {
        String[] words = Arrays.stream(myString.split("x"))
                               .filter(s -> !s.isEmpty())
                               .toArray(String[]::new);

        Arrays.sort(words);
        
        return words;
    }
}