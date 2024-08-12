import java.util.Scanner;

public class ex1estrutura {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        num = sc.nextInt();

        if (num >= 0) {
            System.out.println("O numéro é positivo");
        } else {
            System.out.println("O número é negativo");
        }

    }

}

