import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class J07012 {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("DATA.in");
        ObjectInputStream o = new ObjectInputStream(in);
        ArrayList<String> list = (ArrayList<String>) o.readObject();
        Map<String, Integer> m = new TreeMap<>();
        for(String s : list) {
            s = s.toLowerCase();
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
        List<Map.Entry<String, Integer>> lst = new ArrayList<>(m.entrySet());
        lst.sort((s1,s2) -> s2.getValue() - s1.getValue());

        for (Map.Entry<String, Integer> entry : lst) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
