//array 2D - citire de la tastatura nr de linii si nr de coloane; introducere de la tastatura elementele arrayului;
// afisare array 2D cu for-each si apoi cu for normal

package array_2D;

import java.util.Scanner;

public class Teste7 {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);


        System.out.print("dati nr de linii= ");
        int l = s.nextInt();

        System.out.print("dati nr de coloane= ");
        int c = s.nextInt();


        int a[][] = new int[l][c];

        //parcurgem primul array
        //i este indice de linie

        for (int i = 0; i < a.length; i++) {

            //parcurgem al doilea array care practic este cuprins in primul
            //j este indice de coloana

            for (int j = 0; j < a[i].length; j++) {


                System.out.print("a[" + i + "," + j + "]=");
                a[i][j] = s.nextInt();

            }

        }

        //afisare cu for-each
        for (int x[]:a)

        {
            System.out.print("\n");

            for (int y : x)
                    System.out.printf("%4d",y);

            }

             //pt vizibilitate mai buna adaug un enter intre afisare array 2D si exit code message
            System.out.print("\n");


//        //afisare cu for normal
//        for (int i = 0; i < a.length; i++) {
//
//            System.out.print("\n");
//
//            for (int j = 0; j < a[i].length; j++)
//
//                              System.out.print(a[i][j]+" ");
//
//
//        }
//
//        //pt vizibilitate mai buna adaug un enter intre afisare array 2D si exit code message
//        System.out.print("\n");
        }

}
