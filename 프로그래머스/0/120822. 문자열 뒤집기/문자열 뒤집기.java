class Solution {
    public String solution(String my_string) {
        String[] strArr = my_string.split("");
        int index = strArr.length;
        String[] answer = new String[index];
        
        for(int i = 0; i < index; i++) {
            answer[i] = strArr[index - i - 1];
        }
        
        return String.join("", answer);
    }
}
