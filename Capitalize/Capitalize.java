package Capitalize;

import java.io.*;

public class Capitalize {

    public static void capitalize(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        String line;
        boolean firstLine = true;

        while ((line = reader.readLine()) != null) {

            if (!firstLine) {
                writer.newLine();
            }
            String[] words = line.split(" ");

            for (int i = 0; i < words.length; i++) {

                if (!words[i].isEmpty()) {
                    words[i] =
                            words[i].substring(0, 1).toUpperCase()
                                    + words[i].substring(1).toLowerCase();
                }
            }
            writer.write(String.join(" ", words));
            firstLine = false;
        }
        reader.close();
        writer.close();
    }
}
