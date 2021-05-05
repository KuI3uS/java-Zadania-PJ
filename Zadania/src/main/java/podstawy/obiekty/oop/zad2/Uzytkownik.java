package podstawy.obiekty.oop.zad2;

public class Uzytkownik {
    private int wiek;
    private String name;

    public Uzytkownik(int wiek, String name) {
        this.wiek = wiek;
        this.name = name;
    }

    public boolean czyMozeLegalnieKupicAlkohol(){
        if(wiek >= 18){
            return true;
        }else {
            return false;
        }
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        if (wiek < 0){
            this.wiek = wiek;
        }else {
            throw new RuntimeException ("wiek musi być wiekszy od zera");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
