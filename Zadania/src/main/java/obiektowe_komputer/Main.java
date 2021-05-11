package obiektowe_komputer;

import obiektowe_komputer.drive.HDDDrive;

public class Main {
    public static void main(String[] args){
        Monitor monitor = new Monitor ();
        HDDDrive drive = new HDDDrive ();

        Computer computer = new Computer ( monitor , drive );

        drive.addFile ( new File ( "jnsp.jpg" ) );
        drive.listFiles ();
    }
}
