import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private static int digitSum(int x) {
        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int digits = String.valueOf(N).length();
        int start = Math.max(1, N - 9 * digits);

        for (int i = start; i < N; i++) {
            if (i + digitSum(i) == N) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(0);
    }
}
