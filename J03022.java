import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J03022 {
    public static String capitalize(String s) {
        if (s.length() == 0) {
            return s;
        }
        return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> inputLines = new ArrayList<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            inputLines.add(line);
        }
        sc.close();
        StringBuilder input = new StringBuilder();
        for (String line : inputLines) {
            input.append(line).append("\n");
        }
        String inputText = input.toString();
        StringBuilder r = new StringBuilder();
        List<String> lst = new ArrayList<>();
        for (char i : inputText.toCharArray()) {
            if (i != '.' && i != '?' && i != '!') {
                r.append(i);
            } else {
                lst.add(r.toString());
                r.setLength(0);
            }
        }
        for (String i : lst) {
            if (!i.isEmpty()) {
                String[] sentences = i.trim().split("[.!?]");
                for (String sentence : sentences) {
                    if (!sentence.trim().isEmpty()) {
                        String[] words = sentence.trim().split("\\s+");
                        for (int j = 0; j < words.length; j++) {
                            if (!words[j].isEmpty()) {
                                if (j == 0) {
                                    System.out.print(capitalize(words[j]));
                                } else {
                                    System.out.print(" " + words[j].toLowerCase());
                                }
                            }
                        }
                        
                        System.out.println();
                    }
                }
            }
        }
    }
}