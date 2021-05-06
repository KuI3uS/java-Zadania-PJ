package podstawy.obiekty.app1;

public class Guest {
    private String name;
    private String meal;
    private int iphonNumber;
    private boolean isVegan;

    public Guest(String name, String meal, int iphonNumber, boolean isVegan) {
        this.name = name;
        this.meal = meal;
        this.iphonNumber = iphonNumber;
        this.isVegan = isVegan;
    }


    public String getName() {
        return name;
    }

    public String getMeal() {
        return meal;
    }

    public int getIphonNumber() {
        return iphonNumber;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void displayGuestInformation(){
        System.out.println ("name :" + name);
        System.out.println ("meal :" + meal);
        System.out.println ("Iphone :" + iphonNumber);
        System.out.println ("Vegan : " + isVegan);
    }
}
