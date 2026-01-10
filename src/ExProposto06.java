import java.util.Scanner;

public class ExProposto06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String [] nomes = new String[N];
        int [] idades = new int [N];

        for (int i = 0; i < N; i++) {
            nomes[i] = sc.next();
            idades[i] = sc.nextInt();
        }

        int maisVelho = idades[0];
        int posicaoVelho = 0;
        for (int i = 0; i < N; i++) {
             if (idades[i] > maisVelho) {
                 maisVelho = idades[i];
                 posicaoVelho = i;
             }
        }

        System.out.println("Pessoa mais velha: " + nomes[posicaoVelho]);

        sc.close();
    }
}
