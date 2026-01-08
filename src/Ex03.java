import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double [] vet = new double [N];
        double soma = 0.0;

        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextDouble();
            soma += vet[i];
        }

        for (int i = 0; i < N; i++){
            System.out.printf("%.1f ", vet[i]);
        }

        System.out.println(); // QUEBRA DE LINHA

        double media = soma / N;
        System.out.printf("%.2f%n", soma);
        System.out.printf("%.2f%n", media);

        sc.close();
    }
}
