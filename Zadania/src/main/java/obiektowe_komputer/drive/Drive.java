package obiektowe_komputer.drive;

import obiektowe_komputer.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
