class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] contSlice = num_str.split("");
        for (String num : contSlice) {
            answer += Integer.parseInt(num);
        }
        return answer;
    }
}