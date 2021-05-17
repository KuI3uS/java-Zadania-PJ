package obiektowe_komputer.usbdevice;

public class MemoryStick implements USBDevice{

    protected String name;
    protected boolean ejected = false;

    public MemoryStick (String name){
        this.name = name;
    }



    @Override
    public boolean connect() {
        System.out.println ("connected Memory Stick");
        return true;
    }

    @Override
    public boolean disconnect() {
        if (!ejected ){
            System.out.println ("pleas eject Memory first");
            return false;
        } else {
            System.out.println ("memory Stick disconnected");
            return true;
        }
    }

    public void eject (){
        System.out.println ("ejecting memory stick ");
        ejected = true;
    }

    @Override
    public String getname() {
        return name;
    }
}
