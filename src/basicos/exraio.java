import java.util.Scanner;

public class exraio {
    public static void main(String[] args) {

        double pi;
        pi = 3.14;
        int raio;
        double area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor do raio: ");
        raio = sc.nextInt();

        area = pi * Math.pow(raio, 2);
        System.out.printf("A área desse círculo é: %.4f%n", area);


    }
}
