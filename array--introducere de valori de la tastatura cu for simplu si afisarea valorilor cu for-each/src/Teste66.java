/* array--introducere de valori de la tastatura cu for simplu si afisarea valorilor cu for-each*/

import java.util.Scanner;

public class Teste66 {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);


        System.out.print("Dati nr de elem al array= ");
        int n = s.nextInt();

        int a[] = new int[n];


        for (int i = 0; i < a.length; i++) {

            System.out.print("a" + "[" + i + "]=");
            a[i] = s.nextInt();
        }

        //afisare cu for-each
        for(int x:a)
            System.out.print(x+" ");




    }
}
