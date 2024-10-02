class Solution {
    public int solution(int n, String control) {
        int answer = n; 
        String[] contSlice = control.split("");

        for (int i = 0; i < contSlice.length; i++) {
            if (contSlice[i].equals("w")) {
                answer = answer + 1;
            } else if (contSlice[i].equals("a")) {
                answer = answer - 10;
            } else if (contSlice[i].equals("s")) {
                answer = answer - 1;
            } else if (contSlice[i].equals("d")) {
                answer = answer + 10;
            }
        }
        return answer;
    }
}