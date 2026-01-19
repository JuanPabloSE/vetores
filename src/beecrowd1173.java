import java.util.Scanner;

public class beecrowd1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vetor = new int [10];
        vetor[0] = sc.nextInt();
        int atual = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            vetor[i] = atual * 2;
            atual = vetor[i];
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("N[" + i + "] = " + vetor[i]);
        }


        sc.close();
    }
}
