import java.util.*;

public class J08011 {
    public static boolean check(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) { 
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
        while (sc.hasNext()) {
            String s = sc.next();
            if (check(s)) {
                if (mp.containsKey(s)) {
                    int ts = mp.get(s);
                    mp.put(s, ts + 1); 
                } else {
                    mp.put(s, 1);
                }
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(mp.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return b.getValue() - a.getValue();
            }
        });
        for (Map.Entry<String, Integer> m : list) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
