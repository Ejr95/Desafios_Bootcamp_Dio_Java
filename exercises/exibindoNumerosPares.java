import java.util.Scanner;

public class exibindoNumerosPares {
    public static void main(String[] args) {

        int i,c=0;

        Scanner scan = new Scanner (System.in);

        int n = scan.nextInt();

        for(i=1;i<=n;i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }

        }
    }

}
