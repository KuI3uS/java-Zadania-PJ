package obiektowe_komputer;

import obiektowe_komputer.drive.HDDDrive;
import obiektowe_komputer.drive.SSDDrive;
import obiektowe_komputer.usbdevice.MemoryStick;
import obiektowe_komputer.usbdevice.Mouse;

public class Main {
    public static void main(String[] args){
        Monitor monitor = new Monitor ();
        //SSDDrive drive = new SSDDrive ();
        HDDDrive drive = new HDDDrive ();

        Computer computer = new Computer ( monitor , drive );

//        drive.addFile ( new File ( "jnsp.jpg" ) );
//        drive.listFiles ();

        MemoryStick memoryStick = new MemoryStick ( "Pendrive" );
        Mouse mouse = new Mouse ( "mysz" );

        computer.addUSBDevice ( memoryStick );
//        computer.addUSBDevice ( mouse );

        memoryStick.eject ();
        computer.removeUSBDevice ( memoryStick );
//        computer.removeUSBDevice ( mouse );
    }
}
