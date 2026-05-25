package FileManager;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    public static void createFile(String fileName, String content) throws IOException {
        File file = new File(fileName);
        //Create the file
        if (file.createNewFile()) {
            System.out.println("File is created!");
        } else {
            System.out.println("File already exists.");
        }
        FileWriter writer = new FileWriter(file);
        writer.write(content);
        writer.close();
    }

    public static String getContentFile(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader reader = new FileReader(file);
        int c;
        StringBuilder content = new StringBuilder();
        while ((c = reader.read()) != -1) {
            content.append((char) c);
        }
        reader.close();
        return content.toString();
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);

        if (file.exists()) {
            file.delete();
        }
    }
}