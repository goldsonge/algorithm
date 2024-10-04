class Solution {
    public String solution(String my_string) {
        String answer = "";
        String vowels = "aeiou";
        
        for (int i = 0; i < my_string.length(); i++) {
            if (vowels.indexOf(my_string.charAt(i)) == -1) {
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}