package obiektowe_komputer.usbdevice;

public class Mouse implements USBDevice{

    protected String name;

    public Mouse(String name){
        this.name = name;
    }


    @Override
    public boolean connect() {
        System.out.println ("Mouse Connected");
        return true ;
    }

    @Override
    public boolean disconnect() {
        System.out.println ("mouse disconnected");
        return true;
    }

    @Override
    public String getname() {
        return name;
    }
}
