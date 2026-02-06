import java.util.Scanner;

public class beecrowd1176 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        long [] fib = new long [64];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            System.out.println("Fib("+N+") = " + fib[N]);
        }

        sc.close();
    }
}
