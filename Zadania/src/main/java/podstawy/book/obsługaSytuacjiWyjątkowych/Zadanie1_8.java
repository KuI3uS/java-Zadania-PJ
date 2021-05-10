package podstawy.book.obsługaSytuacjiWyjątkowych;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie1_8 {
    public static void main (String[] args)
    throws IOException {

        double a , b , pole;

        BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );

        try {
            System.out.println ("program obliczy pole prostokąta ");
            System.out.println ("bok a: ");
            a = Double.parseDouble ( br.readLine () );
            System.out.println ("bok b: ");
            b = Double.parseDouble ( br.readLine () );

            pole = a * b;

            System.out.println ("pole prostokąta = " + a + "i bok b +" + b );
            System.out.println ("pole = " + pole);
        } catch (NumberFormatException exc){
            System.out.println ("nie wszystko liczy.");
        }

    }

}
