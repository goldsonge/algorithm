import java.util.*;

class Solution {
    public List<String> solution(String[] str_list) {
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                return Arrays.asList(Arrays.copyOfRange(str_list, 0, i));
            } else if (str_list[i].equals("r")) {
                return Arrays.asList(Arrays.copyOfRange(str_list, i + 1, str_list.length));
            }
        }
        return new ArrayList<>();
    }
}
