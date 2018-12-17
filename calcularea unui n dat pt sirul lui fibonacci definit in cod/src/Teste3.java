/* calcularea unui n dat pt sirul lui fibonacci definit astfel:
     f(0)=0; f(1)=1;
     f(n)=f(n-1)+f(n-2)
     pt n>1 */

import java.util.Scanner;


public class Teste3 {




    public static void main(String args[]){

        Scanner s=new Scanner(System.in);



        System.out.print("Dati n= ");
        int n=s.nextInt();


        int a=1,b=1,i=2,S;



        System.out.print("1 "+ "1 ");

            do  {
                S=a+b;
                System.out.print(S+" ");
                a=b;
                b=S;
                i++;
            }

            while (i<n);

        System.out.print("\n");
        }


}
