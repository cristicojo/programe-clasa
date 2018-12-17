/*Metode care genereaza toate nr prime,nr perfecte,nr palindroame pana la o val mai mica sau egala cu un n dat*/

import java.util.Scanner;

public class Teste2 {





    static int prime(int i)
    {
        int p=1,j;

        for (j=2;j<=i/2;j++)
            if (i%j==0)
                p=0;


        if (p==1)
            return 1;
        else
            return 0;
    }

    static int perfecte(int i)
    {
        int S=0,j;

        for (j=1;j<=i/2;j++)
            if (i%j==0)
                S=S+j;

        if (S==i)
            return 1;
        else
            return 0;
    }

    static int palindroame(int i)
    {
        int m=0,r,p=i;

        while (i!=0)
        {
            r=i%10;
            m=m*10+r;
            i=i/10;
        }

        if (m==p)
            return 1;
        else
            return 0;

    }

    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);



        System.out.print("Dati n= ");
        int n=s.nextInt();




            System.out.print("\n");

            System.out.print("prime sunt numerele ");
            for (int i = 1; i <= n; i++)
                if (prime(i) == 1)
                    System.out.print(i + " ");


            System.out.println("\n");

            System.out.print("perfecte sunt numerele ");

            for (int i = 1; i <= n; i++)
                if (perfecte(i) == 1)
                    System.out.print(i + " ");

            System.out.println("\n");


            System.out.print("palindroame sunt numerele ");


            for (int i = 1; i <= n; i++)
                if (palindroame(i) == 1)
                    System.out.print(i + " ");

            System.out.print("\n");







    }

}
