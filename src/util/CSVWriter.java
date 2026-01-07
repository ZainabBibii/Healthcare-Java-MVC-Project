package util;

import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter {

    public static void append(String path, String line) {
        try (FileWriter fw = new FileWriter(path, true)) {
            fw.write(line + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
