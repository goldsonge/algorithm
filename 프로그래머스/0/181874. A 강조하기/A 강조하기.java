class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i = 0; i < myString.length(); i++) {
            char currentChar = myString.charAt(i);
            if(currentChar == 'a' || currentChar == 'A') {
                answer += Character.toUpperCase(currentChar);
            } else {
                answer += Character.toLowerCase(currentChar);
            }
        }
        return answer;
    }
}