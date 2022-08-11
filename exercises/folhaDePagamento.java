import java.util.Scanner;
import java.util.Locale;

public class folhaDePagamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner (System.in);

        int numero = scan.nextInt();
        int quantidadeHoras = scan.nextInt();
        double valorHora = scan.nextDouble();

        double salary = valorHora*quantidadeHoras;

        System.out.println("NUMBER = "+numero);
        System.out.print("SALARY = U$ ");
        System.out.format("%.2f",salary);
        System.out.println();


    }
}
