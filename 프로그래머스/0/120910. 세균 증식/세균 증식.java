class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        for(int i = 0; i < t; i ++){
            int mathPow =(int) Math.pow(2, i);
            answer = n * (2 * mathPow);
        }
        return answer;
    }
}