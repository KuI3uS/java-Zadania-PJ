package obiektowe_komputer.usbdevice;

public interface USBDevice {
    boolean connect();
    boolean disconnect();
    String getname();
}
