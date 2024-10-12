import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        String[] words = my_string.split(" ");
        
        ArrayList<String> result = new ArrayList<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.add(word);
            }
        }
        
        return result.toArray(new String[0]);
    }
}
