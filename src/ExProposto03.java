import java.util.Locale;
import java.util.Scanner;

public class ExProposto03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [] A =  new int [N];
        int [] B = new int [N];
        int [] C = new int [N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            C[i] = A[i] + B[i];
            System.out.print(C[i] + " ");
        }

        sc.close();
    }
}
