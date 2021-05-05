package podstawy.obiekty.oop.zad1;

public class Main {
    public static void main(String[] args) {
//
//        Garnek garnek = new Garnek ();
//
//        garnek.srednica = 10;
//        garnek.wysokosc = 5;
//        garnek.kolor = "czarny";

        Garnek garnek = new Garnek ( 10, 5, "czarny" );

        System.out.println ( garnek.srednica );
        System.out.println ( garnek.wysokosc );
        System.out.println ( garnek.kolor );

        String wiadomosc = garnek.gotuj ();
        System.out.println ( wiadomosc );

        int temp = garnek.zwrocTempWody ();
        System.out.println (temp);

        String wiadomosc2 = garnek.gotuj (true);
        System.out.println (wiadomosc2);

        garnek.gotujBezInformacji ();

    }

}
