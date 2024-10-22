import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);

        int num01 = numbers[numbers.length - 1] * numbers[numbers.length - 2];

        int num02 = numbers[0] * numbers[1];

        return Math.max(num01, num02);
    }
}