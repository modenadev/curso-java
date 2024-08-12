import java.util.Scanner;

public class ex2estrutura {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("é par");
        } else {
            System.out.println("é impar");
        }
    }
}
