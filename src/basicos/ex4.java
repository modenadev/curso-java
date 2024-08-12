import java.util.Locale;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        int funNum;
        int horasTrabalho;
        double salarioHora;
        double salarioMes;

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o número do funcionario:");
        funNum = sc.nextInt();
        System.out.println("Digite as horas que ele trabalhou: ");
        horasTrabalho = sc.nextInt();
        System.out.println("Qual o salario dele por hora?");
        salarioHora = sc.nextDouble();

        System.out.println("O numéro do funcionario é: " + funNum);
        System.out.println("As horas trabalhadas foram: " + horasTrabalho);
        System.out.println("O salario dele por hora: " + salarioHora);

        salarioMes = horasTrabalho * salarioHora;
        System.out.println("O salario dele no mês foi: " + salarioMes);

        sc.close();

    }
}
