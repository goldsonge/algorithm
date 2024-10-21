import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<Integer> solution(String my_string) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (Character.isDigit(ch)) {
                numbers.add(Character.getNumericValue(ch));
            }
        }

        Collections.sort(numbers);

        return numbers;
    }
}