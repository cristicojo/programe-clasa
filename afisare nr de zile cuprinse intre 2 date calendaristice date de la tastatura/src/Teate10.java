// afisare nr de zile cuprinse intre 2 date calendaristice date de la tastatura

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Teate10 {



    static void date()   {


        Scanner s=new Scanner(System.in);

        System.out.print("dati prima data= ");
        String primadata=s.nextLine();

        System.out.print("dati a doua data= ");
        String adouadata=s.nextLine();




try {


    final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");


    final LocalDate data1 = LocalDate.parse(primadata, formatter);

    final LocalDate data2 = LocalDate.parse(adouadata, formatter);


    final long days = ChronoUnit.DAYS.between(data1, data2);


    System.out.println("Days between: " + days);
}

catch(Exception e){
    System.out.println("dati datele sub forma: dd MM yyyy ");

    date();

        }
    }

    public static void main(String[] args) {
        date();
    }
}
