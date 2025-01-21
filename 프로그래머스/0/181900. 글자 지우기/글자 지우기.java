import java.util.Arrays;

public class Solution {
    public String solution(String my_string, int[] indices) {
        Arrays.sort(indices);

        StringBuilder result = new StringBuilder();

        int currentIndex = 0;
        for (int index : indices) {
            while (currentIndex < index) {
                result.append(my_string.charAt(currentIndex));
                currentIndex++;
            }
            currentIndex++;
        }

        while (currentIndex < my_string.length()) {
            result.append(my_string.charAt(currentIndex));
            currentIndex++;
        }

        return result.toString();
    }
}