import java.util.Scanner;

public class FibonacciVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um termo/número: ");
        int N = sc.nextInt();

        int [] fibonacci = new int [N];

        fibonacci[0] = 0;
        if (N > 1) {
            fibonacci[1] = 1;
        }

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int ler : fibonacci) {
            System.out.printf(ler + " ");
        }

        sc.close();
    }
}
