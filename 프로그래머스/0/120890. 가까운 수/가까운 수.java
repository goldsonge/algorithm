import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);

        int closest = array[0];
        int minDiff = Math.abs(array[0] - n);

        for (int num : array) {
            int diff = Math.abs(num - n);
            if (diff < minDiff) {
                closest = num;
                minDiff = diff;
            } else if (diff == minDiff && num < closest) {
                closest = num;
            }
        }

        return closest;
    }
}