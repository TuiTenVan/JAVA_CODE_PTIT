import java.util.Scanner;

public class J03028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 
        while(t-- > 0) {
            String s = sc.nextLine();
            int n = s.length() / 2;
            String l = s.substring(0, n);
            String r = s.substring(n);
            int rotateLeft = 0;
            int rotateRight = 0;
            for (char c : l.toCharArray()) {
                rotateLeft += c - 'A';
            }
            for (char c : r.toCharArray()) {
                rotateRight += c - 'A';
            }
            StringBuilder rotatedLeft = new StringBuilder();
            for (char c : l.toCharArray()) {
                int rotatedChar = (c - 'A' + rotateLeft) % 26 + 'A';
                rotatedLeft.append((char) rotatedChar);
            }
            StringBuilder rotatedRight = new StringBuilder();
            for (char c : r.toCharArray()) {
                int rotatedChar = (c - 'A' + rotateRight) % 26 + 'A';
                rotatedRight.append((char) rotatedChar);
            }
            StringBuilder merged = new StringBuilder();
            for (int i = 0; i < n; i++) {
                int mergedChar = (rotatedLeft.charAt(i) - 'A' + rotatedRight.charAt(i) - 'A') % 26 + 'A';
                merged.append((char) mergedChar);
            }
            System.out.println(merged.toString());
        }
    }
}
