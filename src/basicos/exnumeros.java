import java.util.Scanner;


public class exnumeros {


    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        num1 = sc.nextInt();
        System.out.println("O primeiro número digitado foi: " + num1);
        System.out.println("Digite outro número");
        num2 = sc.nextInt();
        System.out.println("O segundo número digitado foi: " + num2);

        System.out.println("A soma desses números é igual a: " + (num1 + num2));


    }


}

