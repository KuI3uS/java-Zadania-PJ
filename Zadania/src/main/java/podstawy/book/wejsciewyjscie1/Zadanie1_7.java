package podstawy.book.wejsciewyjscie1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie1_7 {
    public static void main(String[] args)
    throws IOException {

        // Zadanie dla Float

        float x , y , iloczyn , iloraz , suma , różnica ;

        BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );

        System.out.println ("program obliczy sume , różnice , iloraz , iloczyn ");
        System.out.println ("podaj 2 liczby :");
        System.out.println ("x :");
        x = Float.parseFloat ( br.readLine () );
        System.out.println ("y :");
        y = Float.parseFloat ( br.readLine () );

        suma = x + y;
        różnica = x - y;
        iloraz = x / y;
        iloczyn = x * y;

        System.out.printf ("dla liczb: x =" + "%2.2f", x);
        System.out.printf (" i dla y = " + "%2.2f", y);
        System.out.println ();
        System.out.printf ("suma = " + "%2.2f , \n ", + suma);
        System.out.printf ("różnica = " + "%2.2f , \n ", + różnica);
        System.out.printf ("iloraz = " + "%2.2f , \n " ,+ iloraz);
        System.out.printf ("iloczyn = " + "%2.2f , \n ", + iloczyn);

    }
}
