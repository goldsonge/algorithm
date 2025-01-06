class Solution {
    public int solution(int n) {
        int slicesPerPizza = 6;

        int lcm = lcm(slicesPerPizza, n);

        return lcm / slicesPerPizza;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}