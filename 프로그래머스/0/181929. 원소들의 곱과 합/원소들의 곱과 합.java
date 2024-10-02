class Solution {
    public int solution(int[] num_list) {
        int A = 0;
        int B = 1;
        int answer = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            A += num_list[i]; 
            B *= num_list[i];
        }
    
        if (A * A > B) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}