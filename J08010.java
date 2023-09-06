import java.util.*;

public class J08010 {
    public static boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) { 
                return false;
            }
        }
        return true;
    }
    public static int length(String s) {
        return s.length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
        while (sc.hasNext()) {
            String s = sc.next();
            if(s.equals("1")){
                break;
            }
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
                return Integer.compare(length(b.getKey()),length(a.getKey()));
            }
        });
        String s = list.get(0).getKey();
        for(Map.Entry<String, Integer> m : list) {
            if(length(s) == length(m.getKey())){
                System.out.println(m.getKey() + " " + m.getValue());
            }
        }
    }
}
