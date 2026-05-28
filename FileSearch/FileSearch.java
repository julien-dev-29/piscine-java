package FileSearch;

import java.io.File;

public class FileSearch {
    public static String searchFile(String fileName) {
        File documents = new File("documents");
        return search(documents, fileName);
    }

    private static String search(File folder, String fileName) {

        File[] files = folder.listFiles();

        if (files == null) {
            return null;
        }

        for (File file : files) {

            if (file.isDirectory()) {

                String result = search(file, fileName);

                if (result != null) {
                    return result;
                }

            } else if (file.getName().equals(fileName)) {

                return file.getPath();
            }
        }

        return null;
    }
}
