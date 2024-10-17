class Solution {
    public int solution(int[] num_list) {
        if (num_list.length > 10) {
            int sum = 0;
            for (int i = 0; i < num_list.length; i++) {
                sum += num_list[i];
            }
            return sum;
        } 
        
        int product = 1;
        for (int i = 0; i < num_list.length; i++) {
            product *= num_list[i];
        }
        return product;
    }
}