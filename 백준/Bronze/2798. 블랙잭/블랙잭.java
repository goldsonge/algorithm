import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] cards = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) cards[i] = Integer.parseInt(st.nextToken());

        int best = 0;

        for (int i = 0; i < N - 2; i++) {
            if (cards[i] > M) continue;
            for (int j = i + 1; j < N - 1; j++) {
                int two = cards[i] + cards[j];
                if (two > M) continue;
                for (int k = j + 1; k < N; k++) {
                    int sum = two + cards[k];

                    if (sum == M) {
                        System.out.println(M);
                        return;
                    }
                    if (sum < M && sum > best) best = sum;
                }
            }
        }
        System.out.println(best);
    }
}