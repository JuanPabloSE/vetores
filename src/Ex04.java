import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String [] nome = new String[N];
        int [] idade = new int [N];
        double[] altura = new double[N];

        for (int i = 0; i < N; i++){
            nome[i] = sc.next();
            idade[i] = sc.nextInt();
            altura[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < N; i++){
            soma += altura[i];
        }

        double media = soma / N;
        System.out.printf("Altura média = %.2f%n", media);

        int pessoa = 0;
        for (int i = 0; i < N; i++){
            if (idade[i] < 16) {
                pessoa++;
            }
        }

        double idadeMenor = (double) pessoa / N * 100.0;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", idadeMenor);

        sc.close();
    }
}
