import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> solution(int[] num_list, int n) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < num_list.length; i += n) {
            result.add(num_list[i]);
        }
        
        return result;
    }
}