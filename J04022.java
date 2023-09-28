import java.util.*;

class WordSet {
    private TreeSet<String> words;

    public WordSet(String s) {
        words = new TreeSet<>();
        s = s.trim().toLowerCase();
        String[] a = s.split("\\s+");
        for (int i = 0; i < a.length; i++) {
            if (!a[i].isEmpty()) { 
                words.add(a[i]);
            }
        }
    }

    public String union(WordSet other) {
        TreeSet<String> unionSet = new TreeSet<>(words);
        unionSet.addAll(other.words);
        return setToString(unionSet);
    }

    public String intersection(WordSet other) {
        TreeSet<String> intersectionSet = new TreeSet<>(words);
        intersectionSet.retainAll(other.words);
        return setToString(intersectionSet);
    }

    private String setToString(Set<String> words) {
        StringBuilder s = new StringBuilder();
        for (String word : words) {
            s.append(word).append(" ");
        }
        return s.toString().trim();
    }
}

public class J04022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
    public static void main7829301(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}

