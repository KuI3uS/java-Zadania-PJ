package obiektowe_komputer;

import obiektowe_komputer.drive.Drive;
import obiektowe_komputer.usbdevice.USBDevice;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private Monitor monitor;
    private Drive drive;
    private Headphones headphones;

    List<USBDevice> usbDrives = new ArrayList<> ();

    //konstruktor

    public Computer (Monitor monitor , Drive drive){

        this.monitor = monitor;
        this.drive = drive;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Headphones getHeadphones() {
        return headphones;
    }

    public void setHeadphones(Headphones headphones) {
        this.headphones = headphones;
    }

    public List<USBDevice> getUsbDrives() {
        return usbDrives;
    }

    public void addUSBDevice (USBDevice usbDevice){
        boolean isConnected = usbDevice.connect ();

        if (isConnected){
            usbDrives.add ( usbDevice );
        }
    }

    public void removeUSBDevice(USBDevice usbDevice){
        boolean idDisconnected = usbDevice.disconnect ();

        if(!idDisconnected){
            System.out.println ("forcibly removed USB Divice");
        }
        usbDrives.remove ( usbDevice );
    }
}
