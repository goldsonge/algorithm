import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> X = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                int times = arr[i] * 2;
                for (int j = 0; j < times; j++) {
                    X.add(arr[i]);
                }
            } else {
                int removeCount = arr[i];
                for (int j = 0; j < removeCount && !X.isEmpty(); j++) {
                    X.remove(X.size() - 1);
                }
            }
        }
        
        int[] result = new int[X.size()];
        for (int i = 0; i < X.size(); i++) {
            result[i] = X.get(i);
        }
        return result;
    }
}