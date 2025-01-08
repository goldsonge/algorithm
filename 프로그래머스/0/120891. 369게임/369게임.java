class Solution {
    public int solution(int order) {
        int clapCount = 0;

        String orderStr = Integer.toString(order);

        for (int i = 0; i < orderStr.length(); i++) {
            char digit = orderStr.charAt(i);
            
            if (digit == '3' || digit == '6' || digit == '9') {
                clapCount++;
            }
        }
        return clapCount;
    }
}