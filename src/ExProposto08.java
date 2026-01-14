import java.util.Locale;
import java.util.Scanner;

public class ExProposto08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double [] altura = new double[N];
        char [] sexo = new char [N];

        for (int i = 0; i < N; i++) {
            altura[i] = sc.nextDouble();
            sexo[i] = sc.next().charAt(0);
        }

        double maior = altura[0];       // MAIOR ALTURA
        for (int i = 1; i < altura.length; i++) {
            if (altura[i] > maior) {
                maior = altura[i];
            }
        }
        System.out.printf("Maior altura = %.2f%n", maior);

        double menor = altura[0];       // MENOR ALTURA
        for (int i = 1; i < altura.length; i++) {
            if (altura[i] < menor) {
                menor = altura[i];
            }
        }
        System.out.printf("Menor altura = %.2f%n", menor);

        double somaMulheres = 0.0;
        int cont = 0;
        for (int i = 0; i < sexo.length; i++) {
            if (sexo[i] == 'F') {
                cont++;
                somaMulheres += altura[i];
            }
        }

        if (cont == 0) {
            System.out.println("Nao ha nenhuma mulher dentre as pessoas");
        }

        else {
        double mediaMulheres = somaMulheres / cont;
            System.out.printf("Media das alturas das mulheres = %.2f%n", mediaMulheres);
        }

        int contHomens = 0;
        for (int i = 0; i < sexo.length; i++) {
            if (sexo[i] == 'M') {
                contHomens++;
            }
        }
        System.out.printf("Numero de homens = %d%n", contHomens);

        sc.close();
    }
}
