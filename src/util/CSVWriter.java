package util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter {

    public static void append(String path, String line) {
        try {
            File file = new File(path);

            // 🔹 Ensure parent directory exists
            File parent = file.getParentFile();
            if (parent != null && !parent.exists()) {
                parent.mkdirs();
            }

            // 🔹 Create file if missing
            if (!file.exists()) {
                file.createNewFile();
            }

            try (FileWriter fw = new FileWriter(file, true)) {
                fw.write(line + System.lineSeparator());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
