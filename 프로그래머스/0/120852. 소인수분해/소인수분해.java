import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> primeFactors = new LinkedHashSet<>();
        int divisor = 2;

        while (n > 1) {
            if (n % divisor == 0) {
                primeFactors.add(divisor);
                n /= divisor;
            } else {
                divisor++;
            }
        }

        return primeFactors.stream().mapToInt(i -> i).toArray();
    }
}