import java.util.Locale;
import java.util.Scanner;

public class beecrowd1174 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double [] vetor = new double [100];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextDouble();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] <= 10){
            System.out.println("A[" + i + "] = " + vetor[i]);
            }
        }


        sc.close();
    }
}
