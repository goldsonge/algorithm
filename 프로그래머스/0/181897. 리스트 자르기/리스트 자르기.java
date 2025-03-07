import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0], b = slicer[1], c = slicer[2];
        
        switch (n) {
            case 1:
                return Arrays.copyOfRange(num_list, 0, b + 1);
            case 2:
                return Arrays.copyOfRange(num_list, a, num_list.length);
            case 3:
                return Arrays.copyOfRange(num_list, a, b + 1);
            case 4:
                List<Integer> tempList = new ArrayList<>();
                for (int i = a; i <= b; i += c) {
                    tempList.add(num_list[i]);
                }
                return tempList.stream().mapToInt(i -> i).toArray();
            default:
                return new int[0];
        }
    }
}