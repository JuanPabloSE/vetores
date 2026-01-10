import java.util.Locale;
import java.util.Scanner;

public class ExProposto05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [] vet = new int [N];

        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextInt();
        }

        int soma = 0;
        int cont = 0;
        for (int i = 0; i < N; i++) {
            if (vet[i] % 2 == 0) {
            soma += vet[i];
            cont++;
            }
        }

        if (cont == 0) {
            System.out.println("Nao havia nenhum numero par");
        }

        else {
        double media = (double) soma / cont;
        System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
