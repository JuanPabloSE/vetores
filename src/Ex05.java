import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String [] nomes = new String[N];

        for (int i = 0; i < N; i++) {
            nomes[i] = sc.next();
        }

        System.out.println("Nomes lidos:");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        sc.close();
    }
}
