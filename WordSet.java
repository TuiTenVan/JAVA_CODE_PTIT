import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class WordSet {
    private Set<String> words;
    public WordSet(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        words = new TreeSet<>();
        while(sc.hasNext()){
            String s = sc.next().toLowerCase();
            words.add(s);
        }
        sc.close();
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            sb.append(word).append("\n");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
