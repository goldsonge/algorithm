class Solution {
    public int solution(String my_string) {
        int sum = 0;
        StringBuilder num = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (Character.isDigit(ch)) {
                num.append(ch);
            } else {
                if (num.length() > 0) {
                    sum += Integer.parseInt(num.toString());
                    num.setLength(0);
                }
            }
        }
        
        if (num.length() > 0) {
            sum += Integer.parseInt(num.toString());
        }
        
        return sum;
    }
}