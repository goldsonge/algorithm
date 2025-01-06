class Solution {
    public String solution(int age) {
        StringBuilder result = new StringBuilder();
        
        String ageStr = Integer.toString(age);

        for (int i = 0; i < ageStr.length(); i++) {
            char digit = ageStr.charAt(i);

            char alphabet = (char) ('a' + (digit - '0'));

            result.append(alphabet);
        }

        return result.toString();
    }
}