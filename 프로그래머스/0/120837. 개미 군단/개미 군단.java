class Solution {
    public int solution(int hp) {
        int generals = hp / 5; 
        hp %= 5;

        int soldiers = hp / 3; 
        hp %= 3; 

        int workers = hp;

        return generals + soldiers + workers;
    }
}