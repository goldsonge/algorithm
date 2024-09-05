class Solution {
    public int solution(int age) {
        // 현재년도 - 태어난 년도 = 나이 + 1
        // 태어난 년도 = 현재년도 - 1 - 나이
        int thisYear = 2022;
        int briYear = thisYear + 1 - age;
        
        return briYear;
    }
}