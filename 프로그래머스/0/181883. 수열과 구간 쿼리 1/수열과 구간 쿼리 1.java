class Solution {
 public int[] solution(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] diff = new int[n];

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            diff[s]++; 
            if (e + 1 < n) {
                diff[e + 1]--;
            }
        }
     
        int cumulative = 0;
        for (int i = 0; i < n; i++) {
            cumulative += diff[i];
            arr[i] += cumulative;
        }

        return arr;
    }
}