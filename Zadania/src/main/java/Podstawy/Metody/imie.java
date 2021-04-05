package Podstawy.Metody;

import java.util.Scanner;
//Napisz metodę, która zwróci Twoje imię,
public class imie {
    public static void main(String[] args){
        Scanner scanner = new Scanner ( System.in );
        System.out.println ("podaj imię :");
        String name = scanner.nextLine ();

        System.out.println ("hello" + " " + name );

        if(!name.isEmpty () && (!name.endsWith ( "a" ) || name.equals ( "kuba" ))){
            System.out.println ("jesteś mężczyzną");
        }else if (!name.isEmpty ()&& name.endsWith ( "a" )) {
            System.out.println ("jesteś kobietą");
        }else{
            System.out.println ("podaj imie , imie nie może być puste");
        }
    }
}
