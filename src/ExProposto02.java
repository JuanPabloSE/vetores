import java.util.Locale;
import java.util.Scanner;

public class ExProposto02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [] vet = new int [N];

        // Armazenando valores em uma posição do vetor.
        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextInt();
        }

        // Verificando os números pares e fazendo a contagem.
        int cont = 0;
        for (int i = 0; i < N; i++) {
            if (vet[i] % 2 == 0) {
                cont++;
                System.out.print(vet[i] + " ");
            }
        }

        System.out.println();
        System.out.println(cont);

        sc.close();
    }
}
