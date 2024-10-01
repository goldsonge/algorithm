import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        boolean[] hasExtra = new boolean[n+1];
        
        for (int i = 0; i < reserve.length; i++) {
            hasExtra[reserve[i]] = true;
        }

        for (int i = 0; i < lost.length; i++) {
            if (hasExtra[lost[i]]) {
                hasExtra[lost[i]] = false;
                lost[i] = -1;
            }
        }
        
        for (int i = 0; i < lost.length; i++) {
            if (lost[i] != -1) {
                if (lost[i] > 1 && hasExtra[lost[i] - 1]) {
                    hasExtra[lost[i] - 1] = false; 
                } else if (lost[i] < n && hasExtra[lost[i] + 1]) {
                    hasExtra[lost[i] + 1] = false; 
                } else {
                    n--;
                }
            }
        }

        return n;
    }
}