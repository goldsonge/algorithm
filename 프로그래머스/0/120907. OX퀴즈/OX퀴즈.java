class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int index = 0;
        
        for (String s : quiz) {
            int result = 0;
            boolean flag = false;
            for (String str : s.split("=")) {
                str = str.trim();
                if (str.contains(" ")) {
                    String[] temp = str.split(" ");
                    if (temp[1].equals ("+")) {
                        result = Integer.parseInt(temp[0]) + Integer.parseInt(temp[2]);
                    }
                    if (temp[1].equals ("-")) {
                        result = Integer.parseInt(temp[0]) - Integer.parseInt(temp[2]);
                    }
                } else {
                    flag = Integer.parseInt(str) == result;
                }
            
            }
                if (flag) {
                    answer[index] = "O";
                } else {
                    answer[index] = "X";
                }
                
                index++;
        }
        
        return answer;
    }
}