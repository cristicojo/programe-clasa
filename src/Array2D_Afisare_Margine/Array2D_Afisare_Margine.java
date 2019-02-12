package Array2D_Afisare_Margine;

import java.util.Random;
import java.util.Scanner;

public class Array2D_Afisare_Margine {

    private int a[][] = new int[4][4];


    public Array2D_Afisare_Margine() {

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++) {

                //System.out.print("Dati a["+i+","+j+"]=");
                a[i][j] = r.nextInt(100);
            }

    }

    public void afisare() {

        for (int y[] : a) {
            System.out.println();

            for (int z : y)
                System.out.printf("%5d", z);
        }
    }

    public void afisareMargine() {


        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a[i].length; j++) {

                if (i == 0)
                    System.out.printf("%5d", a[0][j]);

                else if (i == 3)
                    System.out.printf("%5d", a[3][j]);

                else if (j == 0)
                    System.out.printf("%5d", a[i][0]);

                else if (j == 3)
                    System.out.printf("%5d", a[i][3]);

                else
                    System.out.print("     ");

            }

        }


    }


    public static void main(String[] args) {
        Array2D_Afisare_Margine edge = new Array2D_Afisare_Margine();

        edge.afisare();
        System.out.println();
        edge.afisareMargine();

        System.out.println();
    }


}
