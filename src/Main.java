import com.sun.source.doctree.SystemPropertyTree;

import java.awt.desktop.PrintFilesEvent;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        int y = 32;
        double x = 10.35784;
        Locale.setDefault(Locale.US);

        System.out.println(y);

        System.out.printf("%.2f\n", x);

        System.out.printf("%.4f\n", x);

        System.out.println("Resultado: " + x + " Metros");

        System.out.printf("RESULTADO = %.2f metros\n", x);

        String nome = "Maria";
        int idade = 20;
        double renda = 5000;

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
    }
