package array_2D_sortare_crescator_perimetru;

import java.util.Scanner;

import static java.lang.Math.random;

public class Teste88 {
    Scanner s;
    int l, c;

    public Teste88() {
        s = new Scanner(System.in);
    }


    public void citire() {

        System.out.print("dati nr de linii= ");
        l = s.nextInt();
        System.out.print("dati nr de coloane= ");
        c = s.nextInt();
    }


    public void ham() {


        if (l == c) {
            int a[][] = new int[l][c];

            for (int i = 0; i < a.length; i++) {

                for (int j = 0; j < a[i].length; j++)
                    a[i][j] = (int) (random() * 20);  //ideea lui Costi de a genera automat elemente random(foarte buna ideea)
            }


            //afisare array 2D inainte de sortare cu for-each
            for (int x[] : a) {

                System.out.print("\n");

                for (int y : x)
                    System.out.printf("%4d", y);

            }
            System.out.println("\n");


            //incepe show-time!!!!!!
            for (int i = 0; i < a.length - 1; i++) { //parcurgere array exterior(outter array)


                for (int j = 0; j < a[i].length - 1; j++)  //sortare pe linia de sus si parcurgere array interior (inner array)


                    if (a[0][j] > a[0][j + 1]) {
                        int temp = a[0][j];
                        a[0][j] = a[0][j + 1];
                        a[0][j + 1] = temp;
                    }


                for (int p = 1; p < a[i].length - 1; p++)  //sortare pe linia de jos

                    if (a[l - 1][p] > a[l - 1][p + 1]) {
                        int temp = a[l - 1][p];
                        a[l - 1][p] = a[l - 1][p + 1];
                        a[l - 1][p + 1] = temp;
                    }


                for (int k = 1; k < a[0].length - 1; k++)  //sortare pe prima coloana

                    if (a[k][0] > a[k + 1][0]) {

                        int temp = a[k][0];
                        a[k][0] = a[k + 1][0];
                        a[k + 1][0] = temp;

                    }


                for (int z = 1; z < a[1].length - 2; z++)   //sortare pe ultima coloana

                    if (a[z][c - 1] > a[z + 1][c - 1]) {

                        int temp = a[z][c - 1];
                        a[z][c - 1] = a[z + 1][c - 1];
                        a[z + 1][c - 1] = temp;
                    }


            }


            // afisare array 2D dupa sortare cu for simplu
            for (int i = 0; i < a.length; i++) {


                for (int j = 0; j < a[i].length; j++)
                    System.out.printf("%4d", a[i][j]);

                System.out.print("\n");
            }


            // spatiu intre afisare array si message exit code
            System.out.print("\n");

        } else {
            System.out.println("nr de linii trebuie sa fie acelasi cu cel de coloane");
            citire();
            ham();
        }
    }


}
