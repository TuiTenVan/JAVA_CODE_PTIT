import java.io.File;
import java.util.*;

public class J07011 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        int n = sc.nextInt();
        Map<String, Integer> m = new TreeMap<>();
        sc.nextLine();
        for (int k = 0; k < n; k++) {
            String s = sc.nextLine().toLowerCase();
            StringBuilder word = new StringBuilder();
            for (char i : s.toCharArray()) {
                if ((i >= 'a' && i <= 'z') || (i >= '0' && i <= '9')) {
                    word.append(i);
                } else {
                    if (word.length() > 0) {
                        String wordStr = word.toString();
                        m.put(wordStr, m.getOrDefault(wordStr, 0) + 1);
                        word.setLength(0);
                    }
                }
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(m.entrySet());
        list.sort((s1,s2) -> s2.getValue() - s1.getValue());

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}