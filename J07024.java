import java.io.*;
import java.util.*;

class WordSet {
    private Set<String> words = new TreeSet<>();

    public WordSet(String fileName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream));
        String line;
        while ((line = br.readLine()) != null) {
            String[] tokens = line.split("\\s+");
            for (String token : tokens) {
                String word = token.toLowerCase();
                words.add(word);
            }
        }
        br.close();
    }

    public String difference(WordSet otherSet) {
        Set<String> diffSet = new TreeSet<>(this.words);
        diffSet.removeAll(otherSet.words);
        return setToString(diffSet);
    }

    private String setToString(Set<String> set) {
    StringBuilder result = new StringBuilder();
    for (String word : set) {
        result.append(word).append(" ");
    }
    return result.toString().trim();
}

}

public class J07024 {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}

