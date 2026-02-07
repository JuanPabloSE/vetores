import java.util.Scanner;

public class beecrowd1177 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int [] vetor = new int[1000];

        for (int i = 0; i < vetor.length; i++) {
           vetor[i] = i % T;
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("N["+i+"] = " + vetor[i]);
        }

        sc.close();
    }
}
