package podstawy.obiekty.oop.zad1;

public class Garnek {
    int srednica;
    int wysokosc;
    String kolor;

    public Garnek(){
    }

    public Garnek(int srednica, int wysokosc){
        this.srednica = srednica;
        this.wysokosc = wysokosc;
    }

    public Garnek(int srednica, int wysokosc, String kolor) {
        this.srednica = srednica;
        this.wysokosc = wysokosc;
        this.kolor = kolor;
    }

    public String gotuj(){
        return "Gotowanie w trakcie";
    }

    public String gotuj(boolean czyDodalesSol){
        if (czyDodalesSol){
            return "dodaleś sol";
        } else {
            return "nie dodaleś soli";
        }
    }
    public int zwrocTempWody(){
        return 100;
    }

    public void gotujBezInformacji(){
        właczGarnek ();
        gotujPrzezpolGodziny ();
        wylaczGarnek ();
    }

    private void właczGarnek() {
        System.out.println ("wlacz garnek");
    }
    private void gotujPrzezpolGodziny(){
        System.out.println ("gotowanie przez 30 min");
    }
    private void wylaczGarnek(){
        System.out.println ("wylacz garnek");
    }


}
