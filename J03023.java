import java.util.HashMap;
import java.util.Scanner;

public class J03023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            String s = sc.next();
            HashMap<Character, Integer> mp = new HashMap<>();
            mp.put('I', 1);
            mp.put('V', 5);
            mp.put('X', 10);
            mp.put('L', 50);
            mp.put('C', 100);
            mp.put('D', 500);
            mp.put('M', 1000);
            int total = 0;
            int prevValue = 0;
            for(int i = s.length() - 1; i >= 0; i--){
                char currentChar = s.charAt(i);
                int currentValue = mp.get(currentChar);
                if (currentValue < prevValue) {
                    total -= currentValue;
                } else {
                    total += currentValue;
                }
                prevValue = currentValue;
            }
            System.out.println(total);
        }
    }
}
