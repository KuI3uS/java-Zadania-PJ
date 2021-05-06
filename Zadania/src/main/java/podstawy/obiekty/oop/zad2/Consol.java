package podstawy.obiekty.oop.zad2;

public class Consol {
    public static void main (String[] args){
        Uzytkownik uzytkownik = new Uzytkownik ( 20 , "Mariusz" );

        if (uzytkownik.czyMozeLegalnieKupicAlkohol ()){
            System.out.println ("moze kupic alkohol");
        } else {
            System.out.println ("nie moze kupic alkoholu");
        }
    }
}
