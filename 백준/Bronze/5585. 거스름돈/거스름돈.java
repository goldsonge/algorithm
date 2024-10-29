import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 500;
        int b = 100;
        int c = 50;
        int d = 10;
        int e = 5;
        int f = 1;

        Scanner sc = new Scanner(System.in);

        int change = 1000 - sc.nextInt();

        int aCount = change / a;
        change %= a;

        int bCount = change / b;
        change %= b;

        int cCount = change / c;
        change %= c;

        int dCount = change / d;
        change %= d;

        int eCount = change / e;
        change %= e;

        int fCount = change / f;

        System.out.println(aCount + bCount + cCount + dCount + eCount + fCount);

        sc.close();
    }
}
