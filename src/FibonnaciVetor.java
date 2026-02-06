import java.util.Scanner;

public class FibonnaciVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um termo/número: ");
        int N = sc.nextInt();

        int [] fibonnaci = new int [N];

        fibonnaci[0] = 0;
        if (N > 1) {
            fibonnaci[1] = 1;
        }

        for (int i = 2; i < fibonnaci.length; i++) {
            fibonnaci[i] = fibonnaci[i - 1] + fibonnaci[i - 2];
        }

        for (int ler : fibonnaci) {
            System.out.printf(ler + " ");
        }

        sc.close();
    }
}
