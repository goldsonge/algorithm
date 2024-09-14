class Solution {
    public int solution(String message) {
        String[] messageTaget = message.split("");
        int answer = messageTaget.length * 2;        
        return answer;
    }
}