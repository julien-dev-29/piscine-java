import java.util.ArrayList;
import java.util.List;

public class CleanExtract {
    public static String extract(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        String[] parts = s.split("\\|");
        List<String> cleanedParts = new ArrayList<>();

        for (String part : parts) {
            part = part.trim();
            int firstDot = part.indexOf('.');
            int lastDot = part.lastIndexOf('.');

            if (firstDot != -1) {
                // Si un seul point, extraire tout après
                if (firstDot == lastDot) {
                    String extracted = part.substring(firstDot + 1).trim();
                    if (!extracted.isEmpty()) {
                        cleanedParts.add(extracted);
                    }
                }
                // Si plusieurs points, extraire entre le premier et le dernier
                else if (firstDot < lastDot) {
                    String extracted = part.substring(firstDot + 1, lastDot).trim();
                    if (!extracted.isEmpty()) {
                        cleanedParts.add(extracted);
                    }
                }
            } else {
                // Pas de point, garder la partie trimée
                if (!part.isEmpty()) {
                    cleanedParts.add(part);
                }
            }
        }

        return String.join(" ", cleanedParts).replaceAll("\\s+", " ").trim();
    }
}
