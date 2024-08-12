import java.util.Scanner;

public class ex3estrutura {
    public static void main(String[] args) {

        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        num1 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        num2 = sc.nextInt();


        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }
    }
}
