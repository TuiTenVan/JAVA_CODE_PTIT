import java.util.HashSet;
import java.util.Scanner;

public class J03038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Character> hs = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            hs.add(s.charAt(i));
        }
        System.out.println(hs.size());
    }
}
