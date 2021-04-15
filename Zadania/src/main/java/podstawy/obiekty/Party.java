package podstawy.obiekty;

import java.util.*;

public class Party {
    private List <Guest> guests = new ArrayList<> ();
    private Set <String> meals = new HashSet<> ();
    private Map <Integer , Guest> phoneToGuest = new HashMap<> ();
    Scanner scanner = new Scanner ( System.in );

    public void addGuest(){
        System.out.println ("Podaj imie : ");
        String name = scanner.nextLine ();

        System.out.println ("Podaj posilek: ");
        String meal = scanner.nextLine ();
        System.out.println ("Podaj numer telefonu : ");
        int iphonNumber = Integer.valueOf (scanner.nextLine ());
        System.out.println ("czy jesteś veganinem? (Y/N) : ");
        String isVeganString = scanner.nextLine ();

        boolean isVegan ;

        if(isVeganString.equals( "Y" )){
            isVegan = true;
        }else {
            isVegan = false;
        }

        Guest guest = new Guest ( name , meal , iphonNumber, isVegan );

        meals.add ( meal );
        phoneToGuest.put ( iphonNumber , guest );
        guests.add ( guest );
    }

    public void displayMeals(){
        for (String meal : meals){
            System.out.println (meal);
        }
    }

    public void dispmayphonNumber(){
        System.out.println ("podaj numer telefonu : ");
        Integer phoneNumber = Integer.valueOf ( scanner.nextLine ());
        Guest guest = phoneToGuest.get ( phoneNumber );
    }

    public void displayGuests(){
        for (Guest guest : guests){
            guest.displayGuestInformation ();
        }
    }
}
