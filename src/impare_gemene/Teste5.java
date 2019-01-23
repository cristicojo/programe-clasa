/*Să se afişeze toate perechile de numere gemene mai mici decât o valoare n citită de la tastatură
(două numere impare se numesc gemene dacă sunt prime şi consecutive)
 Exemplu: n=20, se afişează pe ecran (3,5), (5,7), (11,13), (17,19) */

package impare_gemene;

import java.util.Scanner;

public class Teste5 {


    public static void main(String args[]){


        Scanner s=new Scanner(System.in);



        System.out.print("Dati n= ");
        int n=s.nextInt();


        int p,i,j=0,d;


        //parcurgem nr impare mai maici ca n
        for (i=3;i<n;i+=2)
        {
            p=1;

            for (d=2;d<=i/2 && p==1;d++ )
                if (i % d == 0)
                    p = 0;




         //la fel facem pt al doilea nr
            if (p==1) {
                j = i+ 2;

                if (j < n)
                    {
                        for (d = 2; d <= j / 2 && p == 1; d++)
                            if (j % d == 0)
                                p = 0;

                        if (p == 1)
                            System.out.print("(" + i + "," + j + ")" + " ");
                    }

            }

        }

        System.out.print("\n");

        //System.out.println(Integer.MAX_VALUE);

    }
}
