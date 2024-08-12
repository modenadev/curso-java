import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        int num1;
        int num2;
        int num3;
        int num4;
        int diff;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = sc.nextInt();
        System.out.print("Enter Third Number: ");
        num3 = sc.nextInt();
        System.out.print("Enter Fourth Number: ");
        num4 = sc.nextInt();

        diff = (num1 * num2 - num3 * num4);
        System.out.println("Difference is: " + diff);


    }
}
