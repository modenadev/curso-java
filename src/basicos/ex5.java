import java.util.Locale;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        int codP1, numP1, codP2, numP2;

        double valoruniP1, valoruniP2, total;


        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o código da P1");
        codP1 = sc.nextInt();
        System.out.println("Digite a quantidade de P1s");
        numP1 = sc.nextInt();
        System.out.println("Digite o valor unitário da P1");
        valoruniP1 = sc.nextDouble();

        System.out.println("Digite a quantidade de P2s");
        codP2 = sc.nextInt();
        System.out.println("Digite a quantidade de P2s");
        numP2 = sc.nextInt();
        System.out.println("Digite o valor da P2");
        valoruniP2 = sc.nextDouble();

        total = valoruniP1 * numP1 + valoruniP2 * numP2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();


    }
}
