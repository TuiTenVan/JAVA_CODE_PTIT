import java.util.*;

public class J03029 {
    public static String chuanHoa(String s) {
        s = s.toLowerCase();
        s = Character.toUpperCase(s.charAt(0)) + s.substring(1);
        s = s.trim().replaceAll("\\s+", " ");
        s = s.replaceAll("\\s+([.!?])", "$1"); // xoa khoang trang truong dau "." or "!" or "?" 
        if (!s.endsWith(".") && !s.endsWith("!") && !s.endsWith("?")) {
            s += ".";
        }
        return s;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(chuanHoa(line));
        }
    }
}
