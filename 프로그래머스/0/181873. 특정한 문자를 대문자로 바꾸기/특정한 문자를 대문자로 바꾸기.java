class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        char targetChar = alp.charAt(0);
        
        for(int i = 0; i < my_string.length(); i++) {
            char currentChar = my_string.charAt(i);
            if(currentChar == targetChar) {
                answer += Character.toUpperCase(currentChar);
            } else {
                answer += Character.toLowerCase(currentChar);
            }
        }
        return answer;
    }
}