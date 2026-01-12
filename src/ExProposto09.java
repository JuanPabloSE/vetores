import java.util.Locale;
import java.util.Scanner;

public class ExProposto09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String [] produtos = new String[N];
        double [] precoCompra = new double[N];
        double [] precoVenda = new double[N];

        // CADA ELEMENTO EM SUAS POSIÇÕES.
        for (int i = 0; i < N; i++) {
            produtos[i] = sc.next();
            precoCompra[i] = sc.nextDouble();
            precoVenda[i] = sc.nextDouble();
        }

        // CÁLCULO - LUCRO ENTRE 10% e 20%.
        int quantidadeDezVinte = 0;
        for (int i = 0; i < N; i++) {
            double lucroDezVinte =  ((precoVenda[i] - precoCompra[i]) / precoCompra[i]) * 100.0;
            if (lucroDezVinte >= 10.0 && lucroDezVinte <= 20.0) {
                quantidadeDezVinte++;
            }
        }
        System.out.println("Lucro entre 10% e 20%: " + quantidadeDezVinte);

        // CÁLCULO - LUCRO ABAIXO DE 10%.
        int quantidadeDez = 0;
        for (int i = 0; i < N; i++) {
            double lucroDez =  ((precoVenda[i] - precoCompra[i]) / precoCompra[i]) * 100.0;
            if (lucroDez < 10.0){
                quantidadeDez++;
            }
        }
        System.out.println("Lucro abaixo de 10%: " + quantidadeDez);

        // CÁLCULO - LUCRO ACIMA DE 20%.
        int quantidadeVinte = 0;
        for (int i = 0; i < N; i++) {
            double lucroVinte = ((precoVenda[i] - precoCompra[i]) / precoCompra[i]) * 100;
            if (lucroVinte > 20.0) {
                quantidadeVinte++;
            }
        }
        System.out.println("Lucro acima de 20%: " + quantidadeVinte);

        // VALOR TOTAL DE COMPRA.
        double totalCompra = 0.0;
        for (int i = 0; i < N; i++) {
            totalCompra += precoCompra[i];
        }
        System.out.printf("Valor total de compra: %.2f%n", totalCompra);

        // VALOR TOTAL DE VENDA.
        double totalVenda = 0.0;
        for (int i = 0; i < N; i++) {
            totalVenda += precoVenda[i];
        }
        System.out.printf("Valor total de venda: %.2f%n", totalVenda);

        // LUCRO TOTAL
        double lucroTotal = totalVenda - totalCompra;
        System.out.printf("Lucro total: %.2f%n", lucroTotal);

        sc.close();
    }
}
