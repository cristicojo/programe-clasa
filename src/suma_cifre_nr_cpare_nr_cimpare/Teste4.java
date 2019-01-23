/* suma cifrelor unui n dat si calcularea numarului de cifre pare si impare ale acelui n */

package suma_cifre_nr_cpare_nr_cimpare;

import java.util.Scanner;

public class Teste4 {

    public static void main(String args[]){


        Scanner s=new Scanner(System.in);



        System.out.print("Dati n= ");
        int n=s.nextInt();


        int a,i=0,j=0,S=0;


        do {
            a=n%10;
            S=S+a;
            n=n/10;
            if (a%2==0)
                i=i+1;
            else
                j=j+1;

        }

        while (n!=0);

        System.out.print("\n");
        System.out.print(i + " cifre sunt cifre pare" + "\n");
        System.out.print(j + " cifre sunt cifre impare" + "\n");
        System.out.print("suma cifrelor este " + S);

        System.out.print("\n");



    }
}
