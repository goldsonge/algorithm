import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] parts = myStr.split("[abc]+");
        
        List<String> resultList = new ArrayList<>();
        for (String part : parts) {
            if (!part.isEmpty()) {
                resultList.add(part);
            }
        }
        
        return resultList.isEmpty() ? new String[]{"EMPTY"} : resultList.toArray(new String[0]);
    }
}