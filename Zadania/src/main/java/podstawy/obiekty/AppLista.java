package podstawy.obiekty;

import java.util.Scanner;

public class AppLista {
    public static void main (String[] args){
        Scanner scanner = new Scanner ( System.in );
        boolean shouldContinue = true;

        Party party = new Party ();

        while (shouldContinue){
            System.out.println ("Wybierz obcje ");
            System.out.println ("1. Wyswietl gosci ");
            System.out.println ("2. dodaj goscia ");
            System.out.println ("3. wyswietl potrawy ");
            System.out.println ("4. znajdz numer  ");
            System.out.println ("5. wyjscie ");

            int userChoice = scanner.nextInt ();

            switch (userChoice) {
                case 1 -> party.displayGuests ();
                case 2 -> party.addGuest ();
                case 3 -> party.displayMeals ();
                case 4 -> party.dispmayphonNumber ();
                case 5 -> shouldContinue = false;
            }

//            switch (userChoice){// stara wersja switch
//                case 1:
//                    System.out.println ("wybrano 1 ");
//                    break;
//                case 2:
//                    System.out.println ("wybrano 2");
//                    break;
//                case 3:
//                    System.out.println ("wybrano 3 ");
//                    break;
//                case 4:
//                    System.out.println ("wybrano 4 ");
//                    break;
//                case 5:
//                    shouldContinue = false;
//                    break;
//            }
        }
    }
}
