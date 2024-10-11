class Solution {
    public int solution(String myString, String pat) {
        StringBuilder transformed = new StringBuilder();
        
        for (int i = 0; i < myString.length(); i++) {
            char currentChar = myString.charAt(i);
            if (currentChar == 'A') {
                transformed.append('B');
            } else if (currentChar == 'B') {
                transformed.append('A');
            }
        }
        
        if (transformed.toString().contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }
}
