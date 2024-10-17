import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(String myString) {
        String[] parts = myString.split("x");
        
        List<Integer> lengths = new ArrayList<>();
        
        for (String part : parts) {
            lengths.add(part.length());
        }
        
        if (myString.endsWith("x")) {
            lengths.add(0);
        }
        
        int[] result = new int[lengths.size()];
        for (int i = 0; i < lengths.size(); i++) {
            result[i] = lengths.get(i);
        }
        
        return result;
    }
}
