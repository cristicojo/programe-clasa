/*Cel mai mare divizor comun recursiv*/

import java.util.Scanner;

public class Teste1 {

    static int cmmdc_recursiv(int a,int b)
    {


        if (a==b)
            return a;
        else
        if (a>b)
            return cmmdc_recursiv(a-b,b);
        else
            return cmmdc_recursiv(b-a,a);


    }






    public static void main(String args[]){

        Scanner s=new Scanner(System.in);




            System.out.print("dati a= ");
            int a=s.nextInt();

        System.out.print("dati b= ");
        int b=s.nextInt();

        System.out.println(cmmdc_recursiv(a,b));


        }



    }

