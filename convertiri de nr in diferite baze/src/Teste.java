/*  convertiri de nr in diferite baze  */

import java.util.Scanner;
import static java.lang.Math.pow;

public class Teste {


    //nr este dat in baza 2 si este convertit in baza 10
    int baza2(){

        Scanner s=new Scanner(System.in);

        System.out.print("dati nr in baza 2 pt a fi convertit in baza 10= ");
        int n=s.nextInt();

        int S=0,i=0;
        int r;

        while (n!=0){

            r=n%10;
            n=n/10;
            S=(int) (S+r*pow(2,i));
            i++;

        }



        return S;
    }


    //nr este dat in baza 10 si este convertit in baza 2
    void baza10(){

        Scanner s=new Scanner(System.in);

        System.out.print("dati nr in baza 10 pt a fi convertit in baza 2= ");
        int n=s.nextInt();

        int a[]=new int[10];

        int i=0;
        while (n!=0){

            a[i]=n%2;
            n=n/2;
            i++;

        }
        System.out.print("nr dat si convertit in baza 2 este ");
        for (i=i-1; i>=n; i--)

            System.out.print(a[i]);


        System.out.print("\n");
    }


    //nr este dat in baza 10 si este convertit in baza 16
    void baza_16() {
        Scanner s = new Scanner(System.in);

        System.out.print("dati nr in baza 10 pt a fi convertit in baza 16= ");
        int n = s.nextInt();

        int a[] = new int[20];

        int i = 0;


        while (n != 0) {

            a[i] = n % 16;
            n = n / 16;
            i++;

        }
        System.out.print("nr dat si convertit in baza 16 este ");

        for (i = i - 1; i >= n; i--)

            switch (a[i]) {
                case 10:
                    System.out.print("A");
                    break;

                case 11:
                    System.out.print("B");
                    break;

                case 12:
                    System.out.print("C");
                    break;

                case 13:
                    System.out.print("D");
                    break;

                case 14:
                    System.out.print("E");
                    break;

                case 15:
                    System.out.print("F");
                    break;


                default:
                    System.out.print(a[i]);
            }

        System.out.print("\n");
    }


    //nr este dat in baza 16 si este convertit in baza 10
    public void hex(){

            System.out.print("dati nr in baza 16 pt a fi convertit in baza 10= ");


            Scanner s = new Scanner(System.in);

            String num = s.nextLine();


        int sum=0;
        int newnum = 0;
        String digit = num.toUpperCase();

        for(int i=0;i<digit.length();i++)
        {
            char c = digit.charAt(digit.length()-i-1);

            switch (c){

                case 'A':
                    newnum = 10;
                    break;

                case 'B':
                    newnum = 11;
                    break;

                case 'C':
                    newnum = 12;
                    break;


                case 'D':
                    newnum = 13;
                    break;

                case 'E':
                    newnum = 14;
                    break;

                case 'F':
                    newnum = 15;
                    break;


                default:
                    newnum = Character.getNumericValue(c);

            }



            sum = (int) (sum + newnum*pow(16,i));


        }

        System.out.println("nr dat si convertit in baza 10 este "+sum);

//  alt mod de rezolvare pt metoda hex

//            try{
//
//
//                Integer outputDecimal = Integer.parseInt(inputHex, 16);
//
//                System.out.print("nr dat si convertit in baza 10 este "+outputDecimal);
//
//
//            }
//
//            catch(NumberFormatException e){
//
//
//
//                System.out.println("dati o valoare in hexadecimal valida");
//                hex();
//
//            }


    }



    public static void main(String args[]){

        //instantiam clasa Teste (cream un obiect al clasei Teste)
        Teste t=new Teste();

        System.out.println("nr dat si convertit in baza 10 este "+t.baza2());

        //apelam metodele ce apartin clasei Teste
        t.baza10();
        t.baza_16();
        t.hex();

    }

}


