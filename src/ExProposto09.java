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

        int contAbaixoDe10 = 0;
        int contEntre10E20 = 0;
        int contAcimaDe20 = 0;
        for (int i=0; i<N; i++) {

            double lucro = precoVenda[i] - precoCompra[i];
            double porcentagemDeLucro = lucro / precoCompra[i] * 100.0;

            if (porcentagemDeLucro < 10.0) {
                contAbaixoDe10++;
            }
            else if (porcentagemDeLucro <= 20.0) {
                contEntre10E20++;
            }
            else {
                contAcimaDe20++;
            }
        }
        System.out.println("Lucro abaixo de 10%: " + contAbaixoDe10);
        System.out.println("Lucro entre 10% e 20%: " + contEntre10E20);
        System.out.println("Lucro acima de 20%: " + contAcimaDe20);

        // TOTAIS:
        double totalCompra = 0.0;
        double totalVenda = 0.0;
        for (int i = 0; i < produtos.length; i++) {
            totalCompra += precoCompra[i];
            totalVenda += precoVenda[i];
        }
        double lucroTotal = totalVenda - totalCompra;

        System.out.printf("Valor total de compra: %.2f%n", totalCompra);
        System.out.printf("Valor total de venda: %.2f%n", totalVenda);
        System.out.printf("Lucro total: %.2f%n", lucroTotal);

        sc.close();
    }
}
