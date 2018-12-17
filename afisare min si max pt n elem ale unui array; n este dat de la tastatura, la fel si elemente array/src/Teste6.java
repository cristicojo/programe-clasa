/* array--introducere de valori de la tastatura cu for simplu si afisarea valorilor cu for-each
   si apoi afisarea minimului si maximului pt n elemente; nr de elem n al array este dat de la tastatura;
   elementele sunt date si ele de la tastatura*/

import java.util.Scanner;

public class Teste6 {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);


        System.out.print("Dati nr de elem al array= ");
        int n = s.nextInt();

        int a[] = new int[n];



        //introducere elemente de la tastatura
        for (int i = 0; i < a.length; i++) {

            System.out.print("a" + "[" + i + "]=");
            a[i] = s.nextInt();
        }

        //afisare cu for-each
        for(int x:a)
            System.out.print(x+" ");


        System.out.print("\n");

        //afisare min si max
        int max=a[0];
        int min=a[0];

        for (int i = 1; i < a.length; i++) {

            if (a[i]>=max)
                max=a[i];
            else

            if (a[i]<min)
                          min=a[i];

        }

        System.out.println("maximul este " + max);
        System.out.print("minimul este " + min);


    }
}
