import  java.util.Scanner;

public class analiseDenumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);




            int pares = 0;
            int impares= 0;
            int positivos= 0;
            int negativos= 0;

        for (int i =0; i<5;i++)
        {
            int num = leitor.nextInt();

            if(num%2==0)
            {
                pares ++;
            }
            else
            {
                impares ++;
            }
            if(num>0)
            {
                positivos ++;
            }
            if(num<0)
            {
                negativos++;
            }

        }

        System.out.println( pares+ " par(es)");
        System.out.println(impares + " impar(es)");
        System.out.println( positivos+ " positivo(s)");
        System.out.println( negativos+ " negativo(s)");
    }
}
